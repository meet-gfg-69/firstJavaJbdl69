package org.example.service;

import org.example.domain.Person;
import org.example.domain.Trade;
import org.example.exception.MyCustomException;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamExample {

    /**
     * Java Stream - > 1.8
     *
     * Stream are not collections, rather streams are operating on collections.
     *
     *
     *
     * */

    public static void main(String[] args) {


//        List<Integer> numList=List.of(1,2,3,4,5,6,7,8,9,10);
//
//
//       List<Integer> squaredList = numList.stream().map(StreamExample::squareIt).collect(Collectors.toList());
//
//       for(Integer i: squaredList){
//           System.out.println(i);
//       }



       TradeDAO tradeDAO=new TradeDAO();
       List<Trade> trades=tradeDAO.getLastYearTrades();

       List<Trade> profitTrades=new ArrayList<>();

       for(Trade trade:trades){
           // filtering the trades with result > 0.
           if(trade.getResult()> 0){
               profitTrades.add(trade);
           }
       }

       /***
        *
        * Example of dummy predicate.
        Predicate<Trade> a = x -> {return true;};

        profitTrades= trades.stream().filter(a).collect(Collectors.toList());


        * */

       profitTrades = trades.stream().filter(StreamExample::isTradeProfitable).collect(Collectors.toList());
       profitTrades = trades.stream().filter(x -> x.getResult()>0).collect(Collectors.toList());




        for(Trade trade:profitTrades){
           System.out.println(trade);
       }


        Set<String> profitTradesSymbols=new HashSet<>();

        for(Trade trade:trades){
            // filtering the trades with result > 0 and extracing a part of trade i.e. symbol and putting it to different collection.
            if(trade.getResult()> 0){
                profitTradesSymbols.add(trade.getSymbol());
            }
        }

        for(String symbol:profitTradesSymbols){
            System.out.println(symbol);
        }

        System.out.println("with streams");

        profitTradesSymbols = trades.stream().filter(x -> x.getResult()>0).map(x -> x.getSymbol()).collect(Collectors.toSet());

        for(String symbol:profitTradesSymbols){
            System.out.println(symbol);
        }



      /**
       * create a key value collection where key is symbol and value is list of trade.
       * Tcs -> List<Trades> of symbol TCS only.
       * */


      Map<String,List<Trade>> tradeMap = new HashMap<>();

      for(Trade trade:trades){

          if(tradeMap.containsKey(trade.getSymbol())){
              tradeMap.get(trade.getSymbol()).add(trade);
          }else{
              List<Trade> tradeList = new ArrayList<>();
              tradeList.add(trade);
              tradeMap.put(trade.getSymbol(),tradeList);
          }
      }

      tradeMap = trades.stream().collect(Collectors.groupingBy(x -> x.getSymbol()));
      tradeMap = trades.stream().collect(Collectors.groupingBy(Trade::getSymbol));

      List<Trade> extradedTradesAsSingleList=new ArrayList<>();

      for(List<Trade> tradeList:tradeMap.values()){
          for(Trade trade:tradeList){
              extradedTradesAsSingleList.add(trade);
          }
      }

      extradedTradesAsSingleList=

              tradeMap.    // taking a map
                values() // all values of map
                .stream() // list of list got loaded on stream -> main stream
                .flatMap(x -> x.stream()) // open small stream for every list present on the main stream

                .collect(Collectors.toList()); // collect everything on single list


           tradeMap.    // taking a map
                values() // all values of map
                .stream() // list of list got loaded on stream -> main stream
                .flatMap(List::stream) // open small stream for every list present on the main stream

                .collect(Collectors.toList());


           Double totalResult=0.0;

           for(Trade trade:trades){
               totalResult = totalResult + trade.getResult();
           }

           trades.stream().map(x -> x.getResult()).reduce(0.0,Double::sum);
           trades.stream().map(x -> x.getResult()).reduce(0.0,(x,y) -> x+y);

           trades.stream().mapToDouble(x-> x.getResult()).sum();
           trades.stream().mapToDouble(x-> x.getResult()).max();


          Stream<Double> a = trades.stream().map(x -> x.getResult());
          DoubleStream b=  trades.stream().mapToDouble(x-> x.getResult());

          trades.stream().map(Trade::getSymbol).peek(System.out::println).collect(Collectors.toList());

          /***
           * match
           *
           * */

          for(Trade trade:trades) {
              if (trade.getSymbol().equals("RELIANCE")) {
                  // 10 lines of code

              }

              if (trades.stream().anyMatch(x -> x.getSymbol().equals("RELIANCE"))) {
                  // 10 lines of code
              }

              if (trades.stream().noneMatch(x -> x.getSymbol().equals("RELIANCE"))) {
                  // 10 lines of code
              }
              if (trades.stream().allMatch(x -> x.getResult() != 0)) {
                  // 10 lines of code
              }

              /***
               * OPTIONAL
               * */

              Person person = getMyPerson2();
              System.out.println(person.getName());
              Optional<Person> optionalPerson = getMyPerson();
              if (optionalPerson.isPresent()) {
                  Person p = optionalPerson.get();
              }
              if (optionalPerson.isEmpty()) {
                  Person p = new Person("john", 20);
              }
              Person p = optionalPerson.orElse(new Person("john", 20));


          }
    }

    private static Optional<Person> getMyPerson() {

        return null;
    }

    private  static  Person getMyPerson2(){
        return null;
    }
    public static Integer squareIt(Integer x){
        return x*x;
    }

    public static  boolean isTradeProfitable(Trade x){
        return x.getResult()>0;
    }


    /***
     1. there is a stream of Integers from numList
     2. map -> we want to take an action on the items flowing the stream. Action here is : calling a squareIt method
     3. collecting the return of the SquareIt into a different list and assigning it back to SquaredList.
     * */


    /**
     * Stream functions
     *
     * 1. Filter -> filters the items based on the conditions provided in form predicate.
     * 2. Map -> Covert/map the item into the another data type or object that is required.
     * 3. Flatmap -> opens a small stream for every item in the main stream and converts it into a new stream.
     * */
}