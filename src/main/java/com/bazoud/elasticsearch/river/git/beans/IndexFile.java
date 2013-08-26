package com.bazoud.elasticsearch.river.git.beans;

import lombok.Builder;
import lombok.Data;

/**
 * @author Olivier Bazoud
 */
@Data
@Builder
public class IndexFile {
    private String id;
    private String commit;
    private String project;
    private String ref;
    private String path;
    private String name;
    private String extension;
    private String content;
}
