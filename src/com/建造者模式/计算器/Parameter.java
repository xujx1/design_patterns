package com.建造者模式.计算器;

class Parameter {

    private Parameter(Builder builder) {
        Mark mark = builder.mark;
        double val1 = builder.val1;
        double val2 = builder.val2;

        try {
            Operation operation = (Operation) mark.getClazz().newInstance();
            System.out.println(operation.result(val1, val2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Builder {
        private Mark mark;
        private double val1;
        private double val2;

        Builder() {
        }

        public Builder operation(Mark mark) {
            this.mark = mark;
            return this;
        }

        public Builder val1(double val1) {
            this.val1 = val1;
            return this;
        }

        public Builder val2(double val2) {
            this.val2 = val2;
            return this;
        }

        Parameter builder() {
            return new Parameter(this);
        }
    }
}
