<img width="1094" height="968" alt="image" src="https://github.com/user-attachments/assets/441060c2-7e46-4b68-812d-9b631210c645" /># 通勤キーパー (Commute Keeper)

## 📖 概要
「遅刻連絡の心理的ハードルを下げる」および「二度寝による遅刻を物理的に防ぐ」ことを目的とした、PWA対応の勤怠管理支援アプリケーションです。
出勤前の慌ただしい時間帯に、ワンタップで出発連絡を行ったり、出発時間を過ぎた場合に強力なアラームで警告を発したりすることで、社会人の朝をサポートします。

## 📷 アプリのイメージ
<img width="1094" height="968" alt="通勤キーパー (Commute Keeper)画像" src="https://github.com/user-attachments/assets/fe7f4aed-ca15-4883-a2b5-d4ac51cf531d" />
<img width="1531" height="1715" alt="image" src="https://github.com/user-attachments/assets/42ee2cec-0a4f-4142-bbf4-fbb456425c3d" />

## 💡 こだわりの技術ポイント
Webアプリ（ブラウザ）の制約を技術的な工夫で乗り越え、ネイティブアプリに近い使用感を実現しました。

### 1. Screen Wake Lock API による常時点灯
アラーム待機中にスマホがスリープ（画面消灯）するとWebアプリは停止してしまいます。これを防ぐため、`navigator.wakeLock` を使用して画面の常時点灯を制御。アラーム時計としての実用性を確保しました。

### 2. PWA (Progressive Web Apps) 対応
`manifest.json` を実装し、ホーム画面への追加に対応。ブラウザのアドレスバーを排除した全画面表示により、ネイティブアプリと同等の没入感を提供しています。

## 🛠 使用技術
* **バックエンド**: Java 17, Spring Boot 3
* **フロントエンド**: HTML5, CSS3 (Bootstrap), JavaScript (Vanilla JS), Thymeleaf
* **API / Libraries**:
    * Web Audio API (音声合成)
    * Screen Wake Lock API (省電力制御)
    * Notification API (プッシュ通知)
    * Open-Meteo API (天気予報取得)
* **開発環境**: Eclipse

## 🚀 機能一覧
* **勤怠管理**: 出発ボタンによる打刻、連続達成日数の記録（LocalStorage使用）
* **アラーム**: 設定時刻を過ぎた際の自動アラート（音声＋バイブレーション）
* **天気連携**: 現在地の天気予報と服装アドバイスの表示
* **SMS連携**: リーダーへの遅刻・出発連絡をワンタップでSMSアプリに転送
* **カレンダー**: 出勤記録の視覚化（スタンプ機能）

## 🏁 今後の展望
* ユーザー認証機能の強化（Spring Security導入）
* クラウド環境（Render/Heroku）へのデプロイによる常時稼働
