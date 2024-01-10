package zsxq;

import zsxq.model.aggregates.UnAnsweredQuestionAggregates;

import java.io.IOError;
import java.io.IOException;

/*
此接口用于返回还未回答的问题
 */

public interface Zsxq {
    UnAnsweredQuestionAggregates queryUnAnswerQuestionTopicid(String groupId,String cookie) throws IOException;

    boolean answer(String groupId,) throws IOException;

}
