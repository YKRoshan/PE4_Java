

        transposeString = new TransposeString();
    }

    @After
    public void tearDown() {
        transposeString =null;
    }

    @Test
    public void transposeString() {
        String []expected = {"a","kciuq","nworb","xof","spmuj","revo","eht","yzal","god" };
        String []actual = transposeString.transposeString("a quick brown fox jumps over the lazy dog");
        assertArrayEquals(expected,actual);
    }
}