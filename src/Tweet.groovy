class Tweet {
  String name
  String tweetTime
  String data

  public Tweet(name, tweetTime, data) {
    this.name = name
    this.tweetTime = tweetTime
    this.data = data
  }

  String getTweet() {
    return "$data was tweeted by $name at $tweetTime "
  }
}

// this will throw error as the filename and class defined is different
// def tweet = new Tweet("Abhi", "6th August", "I'm learning groovy");

// change the to get rid of the above error
