package org.ayyy.base.presentationguide.iterator;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:28 PM
 * @Description:游览顺序
 */
public class ExhibitionItinerary implements ExhibitionPointContainer{

    //推荐游览藏品的顺序名字数组
    public String[] exhibitionPointNames = {"藏品点1" , "藏品点2" ,"藏品点3" , "藏品点4"};

    @Override
    public PresentationGuide getGuide() {
        return new ExhibitionPointIterator();
    }

    private class ExhibitionPointIterator implements PresentationGuide{
        int index;


        /**
         *
         * @return 按照guide的顺序的下一个参观点
         */
        @Override
        public Object next() {
            return hasNext()?exhibitionPointNames[index++]:null;
        }


        /**
         * @return 按照当前推荐游览顺序，这个参观点是不是最后一个
         */
        @Override
        public boolean hasNext() {
            return (this.index<exhibitionPointNames.length)?true:false;
        }


        /**
         * @return 下标
         * */
        @Override
        public int getIndex() {
            return index;
        }
    }
}
