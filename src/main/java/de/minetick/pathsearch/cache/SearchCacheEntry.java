package de.minetick.pathsearch.cache;

import net.minecraft.server.Entity;
import net.minecraft.server.EntityInsentient;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PathEntity;

import org.bukkit.util.BlockVector;

public class SearchCacheEntry {
    protected long tick;
    protected BlockVector positionStart;
    protected BlockVector positionTarget;
    protected EntityInsentient entity;
    private PathEntity path;

    public SearchCacheEntry(EntityInsentient entity, PathEntity path) {
        this.entity = entity;
        this.positionStart = this.getEntityPosition(this.entity);
        this.path = path;
        this.tick = this.getCurrentTick();
    }

    protected int getCurrentTick() {
        return MinecraftServer.getServer().aj();
    }

    protected BlockVector getEntityPosition(Entity entity) {
        return new BlockVector(entity.locX, entity.locY, entity.locZ);
    }

    protected BlockVector getTargetPosition(int x, int y, int z) {
        return new BlockVector(x, y, z);
    }

    public boolean isStillValid() {
        return false;
    }

    public PathEntity getPathEntity() {
        return this.path;
    }
}