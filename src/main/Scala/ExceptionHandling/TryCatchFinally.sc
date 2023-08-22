var text = ""
try {
  text = ... // 파일을 읽어오는 코드 호출
} catch {
  case e: FileNotFoundException => println("File not found")
  case e: IOException => println("IO exception occurred")
  case _: Throwable => println("default")
} finally {
  // 에러 캐치를 하고 나서 실행시키고 싶은 코드
  // 예) 데이터베이스 연결 종료
}