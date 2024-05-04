package jtm.activity08;

public class SimpleCalcException extends Exception {


    private static final long serialVersionUID = -8183367738219671137L; // JĀNOSKATĀS ŠIS PRIEKŠ INTELLIJ: https://www.youtube.com/watch?v=Cuv4fMJG3HM

    public SimpleCalcException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimpleCalcException(String message) {
        super(message);
    }

//    public SimpleCalcException(Throwable cause) {
//        super(cause);
//    }
//
//    public SimpleCalcException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public SimpleCalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }

}

