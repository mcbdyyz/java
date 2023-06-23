import TwoTest.MyServer;
import TwoTest.imp.serverImp;

module myOne {
    exports FristTest;
    exports TwoTest;

    provides MyServer with serverImp;
}