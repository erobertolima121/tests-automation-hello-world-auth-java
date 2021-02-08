package pages;

import base.BaseUtil;

public class HelloWorld extends BaseUtil{

    private BaseUtil base;

    public HelloWorld(BaseUtil base) {
        this.base = base;
    }

    public BaseUtil realizaGetNoEndpoint(String operacao) {

        base.response = base.request.get(base.urlDigital + operacao);
        return base;
    }

}
