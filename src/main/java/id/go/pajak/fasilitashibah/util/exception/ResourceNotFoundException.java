package id.go.pajak.fasilitashibah.util.exception;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ResourceNotFoundException extends RuntimeException {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ResourceNotFoundException.class);

    public ResourceNotFoundException(String entity, String... searchParamsMap) {
        super(ResourceNotFoundException.generateMessage(entity, toMap(String.class, String.class, searchParamsMap)));
    }

    public ResourceNotFoundException(String entity) {
        super(ResourceNotFoundException.generateMessage(entity, null));
    }

    private static String generateMessage(String entity, Map<String, String> searchParams) {
        logger.error("Data tidak ditemukan: " + entity + " {}");
        if (searchParams == null) {
            return "data "+ entity + " was not found";
        }
        return StringUtils.capitalize(entity) + " was not found for parameters " + searchParams;
    }

    private static <K, V> Map<K, V> toMap(Class<K> keyType, Class<V> valueType, Object... entries) {
        if (entries.length % 2 == 1) {
            throw new IllegalArgumentException("Invalid entries");
        }
        return IntStream.range(0, entries.length / 2).map(i -> i * 2).collect(HashMap::new, (m, i) -> m.put(keyType.cast(entries[i]), valueType.cast(entries[i + 1])), Map::putAll);
    }

}
