# RxToolScanTest
从Rxtool库抽取出来的二维码扫描库, 一行代码即可.

> 使用方法:

'''
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

'''