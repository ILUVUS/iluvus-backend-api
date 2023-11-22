package iluvus.backend.api.dto;

import java.util.Set;

public class CommunityDto {
    private String name;
    private String description;
    private String rule;

    private boolean isPublic;

    private UserDto owner;
    private Set<UserDto> members;

    public CommunityDto() {
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter methods for rule
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    // Getter and Setter methods for isPublic
    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    // Getter and Setter methods for owner
    public UserDto getOwner() {
        return owner;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }

    // Getter and Setter methods for members
    public Set<UserDto> getMembers() {
        return members;
    }

    public void setMembers(Set<UserDto> members) {
        this.members = members;
    }
}

