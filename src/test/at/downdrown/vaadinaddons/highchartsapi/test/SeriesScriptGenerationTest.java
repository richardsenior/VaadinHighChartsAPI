package at.downdrown.vaadinaddons.highchartsapi.test;

import at.downdrown.vaadinaddons.highchartsapi.model.data.*;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;
import at.downdrown.vaadinaddons.highchartsapi.model.series.*;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.test<br>
 * Klasse: Main.class<br>
 * Erstellt am 19. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class SeriesScriptGenerationTest {

    public static void main(String[] args) {
        AreaChartSeries areaChartSeries = new AreaChartSeries("areaScript");
        areaChartSeries.addData(2);
        areaChartSeries.addData(2.3);
        areaChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        areaChartSeries.addData(new DoubleIntData(2.3, 45));
        areaChartSeries.addData(new IntDoubleData(2, 45.2));
        areaChartSeries.addData(new IntIntData(2, 45));
        areaChartSeries.addData(new StringDoubleData("test", 45.2));
        areaChartSeries.addData(new StringIntData("test", 45));

        System.out.println(areaChartSeries.getHighChartValue());


        AreaRangeChartSeries areaRangeChartSeries = new AreaRangeChartSeries("areaRangeScript");
        areaRangeChartSeries.addData(new AreaRangeChartData(124640640, 14.3, 27.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124649280, 14.5, 27.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124657920, 15.5, 29.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124666560, 16.7, 30.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124675200, 16.5, 25.0));
        areaRangeChartSeries.addData(new AreaRangeChartData(124683840, 17.8, 25.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124692480, 13.5, 24.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124701120, 10.5, 21.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124709760, 9.2, 23.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124718400, 11.6, 21.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124727040, 10.7, 23.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124735680, 11.0, 23.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124744320, 11.6, 23.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124752960, 11.8, 20.7));
        areaRangeChartSeries.addData(new AreaRangeChartData(124761600, 12.6, 22.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124770240, 13.6, 19.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124778880, 11.4, 22.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124787520, 13.2, 25.0));
        areaRangeChartSeries.addData(new AreaRangeChartData(124796160, 14.2, 21.6));
        areaRangeChartSeries.addData(new AreaRangeChartData(124804800, 13.1, 17.1));
        areaRangeChartSeries.addData(new AreaRangeChartData(124813440, 12.2, 15.5));
        areaRangeChartSeries.addData(new AreaRangeChartData(124822080, 12.0, 20.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124830720, 12.0, 17.1));
        areaRangeChartSeries.addData(new AreaRangeChartData(124839360, 12.7, 18.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124848000, 12.4, 19.4));
        areaRangeChartSeries.addData(new AreaRangeChartData(124856640, 12.6, 19.9));
        areaRangeChartSeries.addData(new AreaRangeChartData(124865280, 11.9, 20.2));
        areaRangeChartSeries.addData(new AreaRangeChartData(124873920, 11.0, 19.3));
        areaRangeChartSeries.addData(new AreaRangeChartData(124882560, 10.8, 17.8));
        areaRangeChartSeries.addData(new AreaRangeChartData(124891200, 11.8, 18.5));
        areaRangeChartSeries.addData(new AreaRangeChartData(124899840, 10.8, 16.1));

        System.out.println(areaRangeChartSeries.getHighChartValue());


        AreaSplineChartSeries areaSplineChartSeries = new AreaSplineChartSeries("areaSplineScript");
        areaSplineChartSeries.addData(3);
        areaSplineChartSeries.addData(5);
        areaSplineChartSeries.addData(1);
        areaSplineChartSeries.addData(6);
        areaSplineChartSeries.addData(4);
        areaSplineChartSeries.addData(2);

        System.out.println(areaSplineChartSeries.getHighChartValue());


        AreaSplineRangeChartSeries areaSplineRangeChartSeries = new AreaSplineRangeChartSeries("areaSplineRangeScript");
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124640640, 14.3, 27.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124649280, 14.5, 27.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124657920, 15.5, 29.6));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124666560, 16.7, 30.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124675200, 16.5, 25.0));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124683840, 17.8, 25.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124692480, 13.5, 24.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124701120, 10.5, 21.4));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124709760, 9.2, 23.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124718400, 11.6, 21.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124727040, 10.7, 23.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124735680, 11.0, 23.3));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124744320, 11.6, 23.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124752960, 11.8, 20.7));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124761600, 12.6, 22.4));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124770240, 13.6, 19.6));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124778880, 11.4, 22.6));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124787520, 13.2, 25.0));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124796160, 14.2, 21.6));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124804800, 13.1, 17.1));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124813440, 12.2, 15.5));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124822080, 12.0, 20.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124830720, 12.0, 17.1));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124839360, 12.7, 18.3));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124848000, 12.4, 19.4));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124856640, 12.6, 19.9));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124865280, 11.9, 20.2));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124873920, 11.0, 19.3));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124882560, 10.8, 17.8));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124891200, 11.8, 18.5));
        areaSplineRangeChartSeries.addData(new AreaSplineRangeChartData(124899840, 10.8, 16.1));

        System.out.println(areaSplineRangeChartSeries.getHighChartValue());


        BarChartSeries barChartSeries = new BarChartSeries("barScript");
        barChartSeries.addData(2);
        barChartSeries.addData(2.3);
        barChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        barChartSeries.addData(new DoubleIntData(2.3, 45));
        barChartSeries.addData(new IntDoubleData(2, 45.2));
        barChartSeries.addData(new IntIntData(2, 45));
        barChartSeries.addData(new StringDoubleData("test", 45.2));
        barChartSeries.addData(new StringIntData("test", 45));

        System.out.println(barChartSeries.getHighChartValue());


        BoxPlotChartSeries boxPlotChartSeries = new BoxPlotChartSeries("boxPlotScript");
        boxPlotChartSeries.addData(new BoxPlotChartData(760, 801, 848, 895, 965));
        boxPlotChartSeries.addData(new BoxPlotChartData(733, 853, 939, 980, 1080));
        boxPlotChartSeries.addData(new BoxPlotChartData(714, 762, 817, 870, 918));
        boxPlotChartSeries.addData(new BoxPlotChartData(724, 802, 806, 871, 950));
        boxPlotChartSeries.addData(new BoxPlotChartData(834, 836, 864, 882, 910));

        System.out.println(boxPlotChartSeries.getHighChartValue());


        BubbleChartSeries bubbleChartSeries = new BubbleChartSeries("bubbleScript");
        bubbleChartSeries.addData(new BubbleChartData(9, 81, 63));
        bubbleChartSeries.addData(new BubbleChartData(98, 5, 89));
        bubbleChartSeries.addData(new BubbleChartData(51, 50, 73));
        bubbleChartSeries.addData(new BubbleChartData(41, 22, 14));
        bubbleChartSeries.addData(new BubbleChartData(58, 24, 20));
        bubbleChartSeries.addData(new BubbleChartData(78, 37, 34));
        bubbleChartSeries.addData(new BubbleChartData(55, 56, 53));
        bubbleChartSeries.addData(new BubbleChartData(18, 45, 70));
        bubbleChartSeries.addData(new BubbleChartData(42, 44, 28));
        bubbleChartSeries.addData(new BubbleChartData(3, 52, 59));
        bubbleChartSeries.addData(new BubbleChartData(31, 18, 97));
        bubbleChartSeries.addData(new BubbleChartData(79, 91, 63));
        bubbleChartSeries.addData(new BubbleChartData(93, 23, 23));
        bubbleChartSeries.addData(new BubbleChartData(44, 83, 22));

        System.out.println(bubbleChartSeries.getHighChartValue());


        ColumnChartSeries columnChartSeries = new ColumnChartSeries("columnScript");
        columnChartSeries.addData(2);
        columnChartSeries.addData(2.3);
        columnChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        columnChartSeries.addData(new DoubleIntData(2.3, 45));
        columnChartSeries.addData(new IntDoubleData(2, 45.2));
        columnChartSeries.addData(new IntIntData(2, 45));
        columnChartSeries.addData(new StringDoubleData("test", 45.2));
        columnChartSeries.addData(new StringIntData("test", 45));

        System.out.println(columnChartSeries.getHighChartValue());


        ColumnRangeChartSeries columnRangeChartSeries = new ColumnRangeChartSeries("columnRange");
        columnRangeChartSeries.addData(new ColumnRangeChartData(124640640, 14.3, 27.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124649280, 14.5, 27.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124657920, 15.5, 29.6));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124666560, 16.7, 30.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124675200, 16.5, 25.0));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124683840, 17.8, 25.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124692480, 13.5, 24.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124701120, 10.5, 21.4));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124709760, 9.2, 23.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124718400, 11.6, 21.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124727040, 10.7, 23.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124735680, 11.0, 23.3));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124744320, 11.6, 23.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124752960, 11.8, 20.7));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124761600, 12.6, 22.4));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124770240, 13.6, 19.6));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124778880, 11.4, 22.6));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124787520, 13.2, 25.0));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124796160, 14.2, 21.6));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124804800, 13.1, 17.1));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124813440, 12.2, 15.5));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124822080, 12.0, 20.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124830720, 12.0, 17.1));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124839360, 12.7, 18.3));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124848000, 12.4, 19.4));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124856640, 12.6, 19.9));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124865280, 11.9, 20.2));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124873920, 11.0, 19.3));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124882560, 10.8, 17.8));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124891200, 11.8, 18.5));
        columnRangeChartSeries.addData(new ColumnRangeChartData(124899840, 10.8, 16.1));

        System.out.println(columnRangeChartSeries.getHighChartValue());


        ErrorBarChartSeries errorBarChartSeries = new ErrorBarChartSeries("errorBar");
        errorBarChartSeries.addData(new ErrorBarChartData(124640640, 14.3, 27.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124649280, 14.5, 27.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124657920, 15.5, 29.6));
        errorBarChartSeries.addData(new ErrorBarChartData(124666560, 16.7, 30.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124675200, 16.5, 25.0));
        errorBarChartSeries.addData(new ErrorBarChartData(124683840, 17.8, 25.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124692480, 13.5, 24.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124701120, 10.5, 21.4));
        errorBarChartSeries.addData(new ErrorBarChartData(124709760, 9.2, 23.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124718400, 11.6, 21.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124727040, 10.7, 23.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124735680, 11.0, 23.3));
        errorBarChartSeries.addData(new ErrorBarChartData(124744320, 11.6, 23.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124752960, 11.8, 20.7));
        errorBarChartSeries.addData(new ErrorBarChartData(124761600, 12.6, 22.4));
        errorBarChartSeries.addData(new ErrorBarChartData(124770240, 13.6, 19.6));
        errorBarChartSeries.addData(new ErrorBarChartData(124778880, 11.4, 22.6));
        errorBarChartSeries.addData(new ErrorBarChartData(124787520, 13.2, 25.0));
        errorBarChartSeries.addData(new ErrorBarChartData(124796160, 14.2, 21.6));
        errorBarChartSeries.addData(new ErrorBarChartData(124804800, 13.1, 17.1));
        errorBarChartSeries.addData(new ErrorBarChartData(124813440, 12.2, 15.5));
        errorBarChartSeries.addData(new ErrorBarChartData(124822080, 12.0, 20.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124830720, 12.0, 17.1));
        errorBarChartSeries.addData(new ErrorBarChartData(124839360, 12.7, 18.3));
        errorBarChartSeries.addData(new ErrorBarChartData(124848000, 12.4, 19.4));
        errorBarChartSeries.addData(new ErrorBarChartData(124856640, 12.6, 19.9));
        errorBarChartSeries.addData(new ErrorBarChartData(124865280, 11.9, 20.2));
        errorBarChartSeries.addData(new ErrorBarChartData(124873920, 11.0, 19.3));
        errorBarChartSeries.addData(new ErrorBarChartData(124882560, 10.8, 17.8));
        errorBarChartSeries.addData(new ErrorBarChartData(124891200, 11.8, 18.5));
        errorBarChartSeries.addData(new ErrorBarChartData(124899840, 10.8, 16.1));

        System.out.println(errorBarChartSeries.getHighChartValue());


        FunnelChartSeries funnelChartSeries = new FunnelChartSeries("funnelScript");
        funnelChartSeries.addData(new StringDoubleData("Testwert 1", 22.05));
        funnelChartSeries.addData(new StringDoubleData("Testwert 2", 43.12));
        funnelChartSeries.addData(new StringDoubleData("Testwert 3", 62.45));
        funnelChartSeries.addData(new IntData(3));
        funnelChartSeries.addData(new DoubleData(11.23));

        System.out.println(funnelChartSeries.getHighChartValue());


        LineChartSeries lineChartSeries = new LineChartSeries("lineScript");
        lineChartSeries.addData(2);
        lineChartSeries.addData(2.3);
        lineChartSeries.addData(new DoubleDoubleData(2.3, 45.2));
        lineChartSeries.addData(new DoubleIntData(2.3, 45));
        lineChartSeries.addData(new IntDoubleData(2, 45.2));
        lineChartSeries.addData(new IntIntData(2, 45));
        lineChartSeries.addData(new StringDoubleData("test", 45.2));
        lineChartSeries.addData(new StringIntData("test", 45));

        System.out.println(lineChartSeries.getHighChartValue());

    }
}
