package tech.becoming.common.exceptions;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ExceptionDetail {

    private String codeNumber;
    private String codeId;
    private String message;
    private String name;

    @Getter(AccessLevel.NONE)
    private Throwable throwable;

    public static ExceptionDetail ofNameAndMessage(String name, String message) {
        return ExceptionDetail
                .builder()
                .name(name)
                .message(message)
                .build();
    }

    public String getThrowableMessage() {
        return getMessage(throwable, new StringBuilder())
                .delete(0, 2) // delete last space and semi column
                .reverse() // reverse, because of recursion the messages will be in the wrong order
                .toString();
    }

    private StringBuilder getMessage(Throwable t, StringBuilder b) {
        b.append(" ;").append(t.getMessage());

        if(t.getCause() != null) {
            return getMessage(t.getCause(), b);
        }

        return b;
    }

}
