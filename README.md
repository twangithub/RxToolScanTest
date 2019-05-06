# RxToolScanTest
从Rxtool库抽取出来的二维码扫描库, 一行代码即可.
`二维码` `二维码扫描` `条形码扫码` `一键集成` 

> 使用方法:

1. 导入本demo中的RxScan module
2. 使用如下:

    ```
    findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, ActivityScanerCode.class));

                }
            });

            ActivityScanerCode.setScanerListener(new OnRxScanerListener() {
                @Override
                public void onSuccess(String type, String result) {
                    Log.d("twan","扫描成功:"+result);
                }

                @Override
                public void onFail(String type, String message) {
                    Log.d("twan","扫描失败:"+message);
                }
            });

    ```
