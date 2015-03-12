package com.egg.psalmsapp.utils;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class LogManager implements Serializable {
     
     private static final long serialVersionUID = 6257901441899320512L;
     
     private static final LogManager INSTANCE = new LogManager();
     
     private Logger logger = null;
     
     private LogManager() {
          
     }
     
     public static LogManager getInstance() {
          
          return INSTANCE;
     }
     

     public synchronized void info(Object obj, Exception e) {
          logger = Logger.getLogger(obj.getClass());
          logger.info(e);
     }
     
     public synchronized void debug(Object obj, Exception e) {
          logger = Logger.getLogger(obj.getClass());
          logger.debug(e);
     }
     
     public synchronized void error(Object obj, Exception e) {
          logger = Logger.getLogger(obj.getClass());
          logger.error(e);
     }
     
     public synchronized void debug(Object obj, Error e) {
          logger = Logger.getLogger(obj.getClass());
          logger.debug(e);
     }
     
     public void error(Object obj, Error e) {
          logger = Logger.getLogger(obj.getClass());
          logger.error(e);
     }
     
     /** Object version */
     public synchronized void debug(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.debug(message);
     }
     
     public synchronized void error(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.error(message);
     }
     
     public synchronized void warning(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.warn(message);
     }
     
     public synchronized void fatal(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.fatal(message);
     }
     
     public synchronized void emailFatalError(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.fatal(message);
     }
     
     public synchronized void info(Object obj, String message) {
          logger = Logger.getLogger(obj.getClass());
          logger.info(message);
     }
     
     /**
      * Class version
      */
     
     public synchronized void debug(Class<? extends Object> obj, String message) {
          
          logger = Logger.getLogger(obj);
          logger.debug(message);
     }
     
     public synchronized void error(Class<? extends Object> obj, String message) {
          logger = Logger.getLogger(obj);
          logger.error(message);
     }
     
     public synchronized void error(Class<? extends Object> obj, Throwable t) {
          logger = Logger.getLogger(obj);
          logger.error(t == null ? "" : t.getMessage(), t);
     }
     
     public synchronized void error(Class<? extends Object> obj,
               String message, Throwable t) {
          logger = Logger.getLogger(obj);
          logger.error(message, t);
     }
     
     public synchronized void warning(Class<? extends Object> obj,
               String message) {
          logger = Logger.getLogger(obj);
          logger.warn(message);
     }
     
     public synchronized void fatal(Class<? extends Object> obj, String message) {
          logger = Logger.getLogger(obj);
          logger.fatal(message);
     }
     
     public synchronized void emailFatalError(Class<? extends Object> obj,
               String message) {
          logger = Logger.getLogger(obj);
          logger.fatal(message);
     }
     
     public synchronized void info(Class<? extends Object> obj, String message) {
          logger = Logger.getLogger(obj);
          logger.info(message);
          
     }

     /**
      * String version
      */
     
     public synchronized void debug(String className, String message) {
          
          logger = Logger.getLogger(className);
          logger.debug(message);
     }
     
     public synchronized void error(String className, String message) {
          logger = Logger.getLogger(className);
          logger.error(message);
     }
     
     public synchronized void warning(String className, String message) {
          logger = Logger.getLogger(className);
          logger.warn(message);
     }
     
     public synchronized void fatal(String className, String message) {
          logger = Logger.getLogger(className);
          logger.fatal(message);
     }
     
     public synchronized void emailFatalError(String className, String message) {
          logger = Logger.getLogger(className);
          logger.fatal(message);
     }
     
     public synchronized void info(String className, String message) {
          logger = Logger.getLogger(className);
          logger.info(message);
          
     }
     
}
