package org.kiki.shortlink.dto.resp;

import lombok.Data;

@Data
public class ShortlinkGroupRespDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 分组排序
     */
    private Integer sortOrder;

    /**
     * 分组下短链接数量
     */
    private Integer shortLinkCount;
}
