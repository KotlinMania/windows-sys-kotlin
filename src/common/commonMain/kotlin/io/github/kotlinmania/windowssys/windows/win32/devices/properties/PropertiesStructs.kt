package io.github.kotlinmania.windowssys.windows.win32.devices.properties

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public class Devpropcompkey internal constructor(
    public var key: Devpropkey,
    public var store: Devpropstore,
    localeNameCtorArg: Pcwstr,
) {
    public var localeName: Pcwstr = localeNameCtorArg
        internal set

    public constructor() : this(
        key = Devpropkey(),
        store = 0,
        localeNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Devpropkey = this.key

    public operator fun component2(): Devpropstore = this.store

    public operator fun component3(): Pcwstr = this.localeName

    public fun copy(key: Devpropkey = this.key, store: Devpropstore = this.store, localeName: Pcwstr = this.localeName): Devpropcompkey = Devpropcompkey(key = key, store = store, localeNameCtorArg = localeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devpropcompkey) return false
        if (this.key != other.key) return false
        if (this.store != other.store) return false
        if (this.localeName != other.localeName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.hashCode()
        result = 31 * result + this.store.hashCode()
        result = 31 * result + this.localeName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            key: Devpropkey = Devpropkey(),
            store: Devpropstore = 0,
            localeName: Pcwstr = ConstPtr(0L),
        ): Devpropcompkey =
            Devpropcompkey(
                key = key,
                store = store,
                localeNameCtorArg = localeName,
            )
    }
}

public class Devproperty internal constructor(
    public var compKey: Devpropcompkey,
    public var type: Devproptype,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        compKey = Devpropcompkey(),
        type = 0u,
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Devpropcompkey = this.compKey

    public operator fun component2(): Devproptype = this.type

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): MutPtr = this.buffer

    public fun copy(compKey: Devpropcompkey = this.compKey, type: Devproptype = this.type, bufferSize: UInt = this.bufferSize, buffer: MutPtr = this.buffer): Devproperty = Devproperty(compKey = compKey, type = type, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devproperty) return false
        if (this.compKey != other.compKey) return false
        if (this.type != other.type) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compKey.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            compKey: Devpropcompkey = Devpropcompkey(),
            type: Devproptype = 0u,
            bufferSize: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
        ): Devproperty =
            Devproperty(
                compKey = compKey,
                type = type,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}
