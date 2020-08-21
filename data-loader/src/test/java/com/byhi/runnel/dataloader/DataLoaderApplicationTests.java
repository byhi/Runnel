package com.byhi.runnel.dataloader;

import com.byhi.runnel.dataloader.helper.OutPayDataLoader;
import com.byhi.runnel.dataloader.helper.PolicyDataLoader;
import com.byhi.runnel.dataloader.helper.RepurchaseDataLoader;
import com.byhi.runnel.dataloader.modal.OutPay;
import com.byhi.runnel.dataloader.modal.Policy;
import com.byhi.runnel.dataloader.modal.Repurchase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


import java.io.FileNotFoundException;
import java.util.List;

@SpringBootTest
class DataLoaderApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void policiesTest() throws FileNotFoundException {
        PolicyDataLoader dataLoader = new PolicyDataLoader();
        int expectedSize = 24;
        int expectedLineSize = 8;

        List<Policy> list = dataLoader.loader(this.getClass().getResourceAsStream("/CUSTCOMP01.txt"), "Windows-1250", "|", expectedLineSize);
        Assert.isTrue(expectedSize == list.size(),"List expected size: " + expectedSize + ", actulal: " + list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void outPaysTest() throws FileNotFoundException {
        OutPayDataLoader dataLoader = new OutPayDataLoader();
        int expectedSize = 17;
        int expectedLineSize = 13;

        List<OutPay> list = dataLoader.loader(this.getClass().getResourceAsStream("/OUTPH_CUP_20200204_1829.TXT"), "Windows-1250", ";", expectedLineSize);
        Assert.isTrue(expectedSize == list.size(),"List expected size: " + expectedSize + ", actulal: " + list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void repurchasesTest() throws FileNotFoundException {
        RepurchaseDataLoader dataLoader = new RepurchaseDataLoader();
        int expectedSize = 23;
        int expectedLineSize = 6;

        List<Repurchase> list = dataLoader.loader(this.getClass().getResourceAsStream("/ZTPSPF.TXT"), "Windows-1250", "    ", expectedLineSize);
        Assert.isTrue(expectedSize == list.size(),"List expected size: " + expectedSize + ", actulal: " + list.size());
        list.forEach(System.out::println);
    }
}
