# spark-examples
核物理実験データ解析のためのApache Spark入門用サンプル集

## Environment
筆者の環境は Ubuntu 24.04 LTS です。

## Installation
Apache Sparkをローカル環境にインストールする方法。
ここではAnacondaでpython環境を用意することにする。

- Anaconda (miniconda3) のインストール

Anaconda のサイトから "Installing Miniconda" -> "macOS/Linux installation" -> "Linux terminal installer"
に進みコマンドをコピーしてインストール。
```
wget https://repo.anaconda.com/miniconda/Miniconda3-latest-Linux-x86_64.sh
sh Miniconda3-latest-Linux-x86_64.sh
```
画面の指示に従ってインストールに進む。
auto setup で yes を入力すると.bashrcに設定が書き込まれるので`source .bashrc`をすると自動で環境が立ち上がる。
嫌な場合は`conda config --set auto_activate false`で無効にできる。

- pyspark環境のインストール

新しくspark用にcondaの環境を作る。このリポジトリには、必要な環境をenvironment.yamlにまとめているので、以下を実行するだけ。
```
conda env create -f environment.yaml
```
`pyspark`で起動するようになっていればOK.

## Example notebooks
```
jupyter notebook
```
を起動し、表示されたリンク"http://localhost:8888/tree?token=..." を開き、
e01_basics.ipynbから順番に実行してみてください。
## E01 Basics
基本的な使い方の説明
## E02 Energy calibration
検出器のADCデータをエネルギーに変換する例。
## E03 Histograming
ヒストグラムの作成
## E04 Event building
行にまたがるイベントビルドの説明。γ-γ解析の例。
## E05 pyspark UDF
pyspark UDF (User Defined Function) を使った例。<br>
検出器データのポアソン分布との比較。
## E06 pandas UDF
pandas UDFを使った波形解析の例。
## E07 Scala UDF
Scala を使ったバイナリデータデコーディングの例。