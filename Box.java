class Box {
    int length, width, height;
    boolean fragile;

    Box(int length, int width, int height, boolean fragile) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.fragile = fragile;
    }

    // Cамый большой габарит
    int maxSize() {
        return Math.max(length, Math.max(width, height));
    }

    public String toString() {
        return length + "x" + width + "x" + height + (fragile ? " (хрупкая)" : "");
    }
}

// общая часть для обоих складов
