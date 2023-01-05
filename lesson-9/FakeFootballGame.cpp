#include <iostream>
#include <assert>

using namespace std;

class Game {
public:
    virtual int result() = 0;

};

class FakeFootballGame: public Game{
public:
    int result(){
        return 7;
    }

};

int main(){
    FakeFootballGame game = new FakeFootballGame;
    int gameResult = game.result();
    assert (gameResult==7);
}