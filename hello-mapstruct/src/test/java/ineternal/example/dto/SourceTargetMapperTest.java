package ineternal.example.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SourceTargetMapperTest {

    @Test
    public void testMapping() {
        Source s = new Source();
        s.setTest("5");

        Target t = SourceTargetMapper.MAPPER.toTarget(s);
        assertThat(t.getTesting()).isEqualTo(5);
    }
}
