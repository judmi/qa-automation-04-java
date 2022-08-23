package hw_6;

public class Blocks {


        int width;
        int length;
        int height;

        Blocks (int[] arr) {
            this.width = arr[0];
            this.length = arr[1];
            this.height = arr[2];
        }

        int getWidth() {
            return this.width;
        }

        int getLength() {
            return this.length;
        }

        int getHeight() {
            return this.height;
        }

        int getVolume() {
            return this.width * this.height * this .length;
        }

        int getSurfaceArea() {
            return 2 * (this.width * this.height  + this.length * this.height + this.length * this.width);
        }

}
