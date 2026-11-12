@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse

public class AccessInfo0 internal constructor(
    acc0ResourceNameCtorArg: Pwstr,
) {
    public var acc0ResourceName: Pwstr = acc0ResourceNameCtorArg
        internal set

    public constructor() : this(
        acc0ResourceNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.acc0ResourceName

    public fun copy(acc0ResourceName: Pwstr = this.acc0ResourceName): AccessInfo0 = AccessInfo0(acc0ResourceNameCtorArg = acc0ResourceName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessInfo0) return false
        if (this.acc0ResourceName != other.acc0ResourceName) return false
        return true
    }

    override fun hashCode(): Int = this.acc0ResourceName.hashCode()

    public companion object {
        public operator fun invoke(
            acc0ResourceName: Pwstr = MutPtr(0L),
        ): AccessInfo0 =
            AccessInfo0(
                acc0ResourceNameCtorArg = acc0ResourceName,
            )
    }
}

public class AccessInfo1 internal constructor(
    acc1ResourceNameCtorArg: Pwstr,
    public var acc1Attr: UInt,
    public var acc1Count: UInt,
) {
    public var acc1ResourceName: Pwstr = acc1ResourceNameCtorArg
        internal set

    public constructor() : this(
        acc1ResourceNameCtorArg = MutPtr(0L),
        acc1Attr = 0u,
        acc1Count = 0u,
    )

    public operator fun component1(): Pwstr = this.acc1ResourceName

    public operator fun component2(): UInt = this.acc1Attr

    public operator fun component3(): UInt = this.acc1Count

    public fun copy(acc1ResourceName: Pwstr = this.acc1ResourceName, acc1Attr: UInt = this.acc1Attr, acc1Count: UInt = this.acc1Count): AccessInfo1 = AccessInfo1(acc1ResourceNameCtorArg = acc1ResourceName, acc1Attr = acc1Attr, acc1Count = acc1Count)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessInfo1) return false
        if (this.acc1ResourceName != other.acc1ResourceName) return false
        if (this.acc1Attr != other.acc1Attr) return false
        if (this.acc1Count != other.acc1Count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.acc1ResourceName.hashCode()
        result = 31 * result + this.acc1Attr.hashCode()
        result = 31 * result + this.acc1Count.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            acc1ResourceName: Pwstr = MutPtr(0L),
            acc1Attr: UInt = 0u,
            acc1Count: UInt = 0u,
        ): AccessInfo1 =
            AccessInfo1(
                acc1ResourceNameCtorArg = acc1ResourceName,
                acc1Attr = acc1Attr,
                acc1Count = acc1Count,
            )
    }
}

public data class AccessInfo1002(
    public var acc1002Attr: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessInfo1002> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessInfo1002> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AccessInfo1002 =
                    AccessInfo1002(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AccessInfo1002) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.acc1002Attr)
                }
            }
    }
}

public class AccessList internal constructor(
    aclUgnameCtorArg: Pwstr,
    public var aclAccess: UInt,
) {
    public var aclUgname: Pwstr = aclUgnameCtorArg
        internal set

    public constructor() : this(
        aclUgnameCtorArg = MutPtr(0L),
        aclAccess = 0u,
    )

    public operator fun component1(): Pwstr = this.aclUgname

    public operator fun component2(): UInt = this.aclAccess

    public fun copy(aclUgname: Pwstr = this.aclUgname, aclAccess: UInt = this.aclAccess): AccessList = AccessList(aclUgnameCtorArg = aclUgname, aclAccess = aclAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessList) return false
        if (this.aclUgname != other.aclUgname) return false
        if (this.aclAccess != other.aclAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aclUgname.hashCode()
        result = 31 * result + this.aclAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aclUgname: Pwstr = MutPtr(0L),
            aclAccess: UInt = 0u,
        ): AccessList =
            AccessList(
                aclUgnameCtorArg = aclUgname,
                aclAccess = aclAccess,
            )
    }
}

public data class AdminOtherInfo(
    public var alrtadErrcode: UInt = 0u,
    public var alrtadNumstrings: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdminOtherInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdminOtherInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AdminOtherInfo =
                    AdminOtherInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AdminOtherInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alrtadErrcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alrtadNumstrings)
                }
            }
    }
}

public data class AeAcclim(
    public var aeAlCompname: UInt = 0u,
    public var aeAlUsername: UInt = 0u,
    public var aeAlResname: UInt = 0u,
    public var aeAlLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeAcclim> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeAcclim> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeAcclim =
                    AeAcclim(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeAcclim) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeAlCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeAlUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeAlResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeAlLimit)
                }
            }
    }
}

public data class AeAclmod(
    public var aeAmCompname: UInt = 0u,
    public var aeAmUsername: UInt = 0u,
    public var aeAmResname: UInt = 0u,
    public var aeAmAction: UInt = 0u,
    public var aeAmDatalen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeAclmod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeAclmod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): AeAclmod =
                    AeAclmod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AeAclmod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeAmCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeAmUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeAmResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeAmAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeAmDatalen)
                }
            }
    }
}

public data class AeClosefile(
    public var aeCfCompname: UInt = 0u,
    public var aeCfUsername: UInt = 0u,
    public var aeCfResname: UInt = 0u,
    public var aeCfFileid: UInt = 0u,
    public var aeCfDuration: UInt = 0u,
    public var aeCfReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeClosefile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeClosefile> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AeClosefile =
                    AeClosefile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AeClosefile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeCfCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeCfUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeCfResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeCfFileid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeCfDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeCfReason)
                }
            }
    }
}

public data class AeConnrej(
    public var aeCrCompname: UInt = 0u,
    public var aeCrUsername: UInt = 0u,
    public var aeCrNetname: UInt = 0u,
    public var aeCrReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnrej> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnrej> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeConnrej =
                    AeConnrej(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeConnrej) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeCrCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeCrUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeCrNetname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeCrReason)
                }
            }
    }
}

public data class AeConnstart(
    public var aeCtCompname: UInt = 0u,
    public var aeCtUsername: UInt = 0u,
    public var aeCtNetname: UInt = 0u,
    public var aeCtConnid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnstart> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnstart> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeConnstart =
                    AeConnstart(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeConnstart) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeCtCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeCtUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeCtNetname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeCtConnid)
                }
            }
    }
}

public data class AeConnstop(
    public var aeCpCompname: UInt = 0u,
    public var aeCpUsername: UInt = 0u,
    public var aeCpNetname: UInt = 0u,
    public var aeCpConnid: UInt = 0u,
    public var aeCpReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnstop> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeConnstop> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): AeConnstop =
                    AeConnstop(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AeConnstop) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeCpCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeCpUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeCpNetname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeCpConnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeCpReason)
                }
            }
    }
}

public data class AeGeneric(
    public var aeGeMsgfile: UInt = 0u,
    public var aeGeMsgnum: UInt = 0u,
    public var aeGeParams: UInt = 0u,
    public var aeGeParam1: UInt = 0u,
    public var aeGeParam2: UInt = 0u,
    public var aeGeParam3: UInt = 0u,
    public var aeGeParam4: UInt = 0u,
    public var aeGeParam5: UInt = 0u,
    public var aeGeParam6: UInt = 0u,
    public var aeGeParam7: UInt = 0u,
    public var aeGeParam8: UInt = 0u,
    public var aeGeParam9: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeGeneric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeGeneric> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): AeGeneric =
                    AeGeneric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: AeGeneric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeGeMsgfile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeGeMsgnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeGeParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeGeParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeGeParam2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeGeParam3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.aeGeParam4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.aeGeParam5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.aeGeParam6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.aeGeParam7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.aeGeParam8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.aeGeParam9)
                }
            }
    }
}

public data class AeLockout(
    public var aeLkCompname: UInt = 0u,
    public var aeLkUsername: UInt = 0u,
    public var aeLkAction: UInt = 0u,
    public var aeLkBadPwCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeLockout> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeLockout> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeLockout =
                    AeLockout(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeLockout) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeLkCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeLkUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeLkAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeLkBadPwCount)
                }
            }
    }
}

public data class AeNetlogoff(
    public var aeNfCompname: UInt = 0u,
    public var aeNfUsername: UInt = 0u,
    public var aeNfReserved1: UInt = 0u,
    public var aeNfReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeNetlogoff> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeNetlogoff> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeNetlogoff =
                    AeNetlogoff(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeNetlogoff) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeNfCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeNfUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeNfReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeNfReserved2)
                }
            }
    }
}

public data class AeNetlogon(
    public var aeNoCompname: UInt = 0u,
    public var aeNoUsername: UInt = 0u,
    public var aeNoPrivilege: UInt = 0u,
    public var aeNoAuthflags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeNetlogon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeNetlogon> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeNetlogon =
                    AeNetlogon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeNetlogon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeNoCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeNoUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeNoPrivilege)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeNoAuthflags)
                }
            }
    }
}

public data class AeResaccess(
    public var aeRaCompname: UInt = 0u,
    public var aeRaUsername: UInt = 0u,
    public var aeRaResname: UInt = 0u,
    public var aeRaOperation: UInt = 0u,
    public var aeRaReturncode: UInt = 0u,
    public var aeRaRestype: UInt = 0u,
    public var aeRaFileid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeResaccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeResaccess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): AeResaccess =
                    AeResaccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AeResaccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeRaCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeRaUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeRaResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeRaOperation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeRaReturncode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeRaRestype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.aeRaFileid)
                }
            }
    }
}

public data class AeResaccessrej(
    public var aeRrCompname: UInt = 0u,
    public var aeRrUsername: UInt = 0u,
    public var aeRrResname: UInt = 0u,
    public var aeRrOperation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeResaccessrej> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeResaccessrej> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AeResaccessrej =
                    AeResaccessrej(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AeResaccessrej) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeRrCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeRrUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeRrResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeRrOperation)
                }
            }
    }
}

public data class AeServicestat(
    public var aeSsCompname: UInt = 0u,
    public var aeSsUsername: UInt = 0u,
    public var aeSsSvcname: UInt = 0u,
    public var aeSsStatus: UInt = 0u,
    public var aeSsCode: UInt = 0u,
    public var aeSsText: UInt = 0u,
    public var aeSsReturnval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeServicestat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeServicestat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): AeServicestat =
                    AeServicestat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AeServicestat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeSsCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeSsUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeSsSvcname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeSsStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeSsCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeSsText)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.aeSsReturnval)
                }
            }
    }
}

public data class AeSesslogoff(
    public var aeSfCompname: UInt = 0u,
    public var aeSfUsername: UInt = 0u,
    public var aeSfReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesslogoff> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesslogoff> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AeSesslogoff =
                    AeSesslogoff(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AeSesslogoff) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeSfCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeSfUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeSfReason)
                }
            }
    }
}

public data class AeSesslogon(
    public var aeSoCompname: UInt = 0u,
    public var aeSoUsername: UInt = 0u,
    public var aeSoPrivilege: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesslogon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesslogon> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AeSesslogon =
                    AeSesslogon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AeSesslogon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeSoCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeSoUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeSoPrivilege)
                }
            }
    }
}

public data class AeSesspwerr(
    public var aeSpCompname: UInt = 0u,
    public var aeSpUsername: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesspwerr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSesspwerr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AeSesspwerr =
                    AeSesspwerr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AeSesspwerr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeSpCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeSpUsername)
                }
            }
    }
}

public data class AeSrvstatus(
    public var aeSvStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSrvstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeSrvstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AeSrvstatus =
                    AeSrvstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AeSrvstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeSvStatus)
                }
            }
    }
}

public data class AeUasmod(
    public var aeUmCompname: UInt = 0u,
    public var aeUmUsername: UInt = 0u,
    public var aeUmResname: UInt = 0u,
    public var aeUmRectype: UInt = 0u,
    public var aeUmAction: UInt = 0u,
    public var aeUmDatalen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeUasmod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeUasmod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AeUasmod =
                    AeUasmod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AeUasmod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeUmCompname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeUmUsername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeUmResname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeUmRectype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeUmAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeUmDatalen)
                }
            }
    }
}

public class AtEnum internal constructor(
    public var jobId: UInt,
    public var jobTime: Int,
    public var daysOfMonth: UInt,
    public var daysOfWeek: UByte,
    public var flags: UByte,
    commandCtorArg: Pwstr,
) {
    public var command: Pwstr = commandCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        jobTime = 0,
        daysOfMonth = 0u,
        daysOfWeek = 0u,
        flags = 0u,
        commandCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.jobId

    public operator fun component2(): Int = this.jobTime

    public operator fun component3(): UInt = this.daysOfMonth

    public operator fun component4(): UByte = this.daysOfWeek

    public operator fun component5(): UByte = this.flags

    public operator fun component6(): Pwstr = this.command

    public fun copy(jobId: UInt = this.jobId, jobTime: Int = this.jobTime, daysOfMonth: UInt = this.daysOfMonth, daysOfWeek: UByte = this.daysOfWeek, flags: UByte = this.flags, command: Pwstr = this.command): AtEnum = AtEnum(jobId = jobId, jobTime = jobTime, daysOfMonth = daysOfMonth, daysOfWeek = daysOfWeek, flags = flags, commandCtorArg = command)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtEnum) return false
        if (this.jobId != other.jobId) return false
        if (this.jobTime != other.jobTime) return false
        if (this.daysOfMonth != other.daysOfMonth) return false
        if (this.daysOfWeek != other.daysOfWeek) return false
        if (this.flags != other.flags) return false
        if (this.command != other.command) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jobId.hashCode()
        result = 31 * result + this.jobTime.hashCode()
        result = 31 * result + this.daysOfMonth.hashCode()
        result = 31 * result + this.daysOfWeek.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.command.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            jobTime: Int = 0,
            daysOfMonth: UInt = 0u,
            daysOfWeek: UByte = 0u,
            flags: UByte = 0u,
            command: Pwstr = MutPtr(0L),
        ): AtEnum =
            AtEnum(
                jobId = jobId,
                jobTime = jobTime,
                daysOfMonth = daysOfMonth,
                daysOfWeek = daysOfWeek,
                flags = flags,
                commandCtorArg = command,
            )
    }
}

public class AtInfo internal constructor(
    public var jobTime: Int,
    public var daysOfMonth: UInt,
    public var daysOfWeek: UByte,
    public var flags: UByte,
    commandCtorArg: Pwstr,
) {
    public var command: Pwstr = commandCtorArg
        internal set

    public constructor() : this(
        jobTime = 0,
        daysOfMonth = 0u,
        daysOfWeek = 0u,
        flags = 0u,
        commandCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.jobTime

    public operator fun component2(): UInt = this.daysOfMonth

    public operator fun component3(): UByte = this.daysOfWeek

    public operator fun component4(): UByte = this.flags

    public operator fun component5(): Pwstr = this.command

    public fun copy(jobTime: Int = this.jobTime, daysOfMonth: UInt = this.daysOfMonth, daysOfWeek: UByte = this.daysOfWeek, flags: UByte = this.flags, command: Pwstr = this.command): AtInfo = AtInfo(jobTime = jobTime, daysOfMonth = daysOfMonth, daysOfWeek = daysOfWeek, flags = flags, commandCtorArg = command)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtInfo) return false
        if (this.jobTime != other.jobTime) return false
        if (this.daysOfMonth != other.daysOfMonth) return false
        if (this.daysOfWeek != other.daysOfWeek) return false
        if (this.flags != other.flags) return false
        if (this.command != other.command) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jobTime.hashCode()
        result = 31 * result + this.daysOfMonth.hashCode()
        result = 31 * result + this.daysOfWeek.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.command.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            jobTime: Int = 0,
            daysOfMonth: UInt = 0u,
            daysOfWeek: UByte = 0u,
            flags: UByte = 0u,
            command: Pwstr = MutPtr(0L),
        ): AtInfo =
            AtInfo(
                jobTime = jobTime,
                daysOfMonth = daysOfMonth,
                daysOfWeek = daysOfWeek,
                flags = flags,
                commandCtorArg = command,
            )
    }
}

public data class AuditEntry(
    public var aeLen: UInt = 0u,
    public var aeReserved: UInt = 0u,
    public var aeTime: UInt = 0u,
    public var aeType: UInt = 0u,
    public var aeDataOffset: UInt = 0u,
    public var aeDataSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AuditEntry =
                    AuditEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AuditEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aeLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aeReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aeDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aeDataSize)
                }
            }
    }
}

public class ConfigInfo0 internal constructor(
    cfgi0KeyCtorArg: Pwstr,
    cfgi0DataCtorArg: Pwstr,
) {
    public var cfgi0Key: Pwstr = cfgi0KeyCtorArg
        internal set

    public var cfgi0Data: Pwstr = cfgi0DataCtorArg
        internal set

    public constructor() : this(
        cfgi0KeyCtorArg = MutPtr(0L),
        cfgi0DataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.cfgi0Key

    public operator fun component2(): Pwstr = this.cfgi0Data

    public fun copy(cfgi0Key: Pwstr = this.cfgi0Key, cfgi0Data: Pwstr = this.cfgi0Data): ConfigInfo0 = ConfigInfo0(cfgi0KeyCtorArg = cfgi0Key, cfgi0DataCtorArg = cfgi0Data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigInfo0) return false
        if (this.cfgi0Key != other.cfgi0Key) return false
        if (this.cfgi0Data != other.cfgi0Data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cfgi0Key.hashCode()
        result = 31 * result + this.cfgi0Data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cfgi0Key: Pwstr = MutPtr(0L),
            cfgi0Data: Pwstr = MutPtr(0L),
        ): ConfigInfo0 =
            ConfigInfo0(
                cfgi0KeyCtorArg = cfgi0Key,
                cfgi0DataCtorArg = cfgi0Data,
            )
    }
}

public class DsregJoinInfo internal constructor(
    public var joinType: DsregJoinType,
    pJoinCertificateCtorArg: ConstPtr,
    pszDeviceIdCtorArg: Pwstr,
    pszIdpDomainCtorArg: Pwstr,
    pszTenantIdCtorArg: Pwstr,
    pszJoinUserEmailCtorArg: Pwstr,
    pszTenantDisplayNameCtorArg: Pwstr,
    pszMdmEnrollmentUrlCtorArg: Pwstr,
    pszMdmTermsOfUseUrlCtorArg: Pwstr,
    pszMdmComplianceUrlCtorArg: Pwstr,
    pszUserSettingSyncUrlCtorArg: Pwstr,
    pUserInfoCtorArg: MutPtr,
) {
    public var pJoinCertificate: ConstPtr = pJoinCertificateCtorArg
        internal set

    public var pszDeviceId: Pwstr = pszDeviceIdCtorArg
        internal set

    public var pszIdpDomain: Pwstr = pszIdpDomainCtorArg
        internal set

    public var pszTenantId: Pwstr = pszTenantIdCtorArg
        internal set

    public var pszJoinUserEmail: Pwstr = pszJoinUserEmailCtorArg
        internal set

    public var pszTenantDisplayName: Pwstr = pszTenantDisplayNameCtorArg
        internal set

    public var pszMdmEnrollmentUrl: Pwstr = pszMdmEnrollmentUrlCtorArg
        internal set

    public var pszMdmTermsOfUseUrl: Pwstr = pszMdmTermsOfUseUrlCtorArg
        internal set

    public var pszMdmComplianceUrl: Pwstr = pszMdmComplianceUrlCtorArg
        internal set

    public var pszUserSettingSyncUrl: Pwstr = pszUserSettingSyncUrlCtorArg
        internal set

    public var pUserInfo: MutPtr = pUserInfoCtorArg
        internal set

    public constructor() : this(
        joinType = 0,
        pJoinCertificateCtorArg = ConstPtr(0L),
        pszDeviceIdCtorArg = MutPtr(0L),
        pszIdpDomainCtorArg = MutPtr(0L),
        pszTenantIdCtorArg = MutPtr(0L),
        pszJoinUserEmailCtorArg = MutPtr(0L),
        pszTenantDisplayNameCtorArg = MutPtr(0L),
        pszMdmEnrollmentUrlCtorArg = MutPtr(0L),
        pszMdmTermsOfUseUrlCtorArg = MutPtr(0L),
        pszMdmComplianceUrlCtorArg = MutPtr(0L),
        pszUserSettingSyncUrlCtorArg = MutPtr(0L),
        pUserInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DsregJoinType = this.joinType

    public operator fun component2(): ConstPtr = this.pJoinCertificate

    public operator fun component3(): Pwstr = this.pszDeviceId

    public operator fun component4(): Pwstr = this.pszIdpDomain

    public operator fun component5(): Pwstr = this.pszTenantId

    public operator fun component6(): Pwstr = this.pszJoinUserEmail

    public operator fun component7(): Pwstr = this.pszTenantDisplayName

    public operator fun component8(): Pwstr = this.pszMdmEnrollmentUrl

    public operator fun component9(): Pwstr = this.pszMdmTermsOfUseUrl

    public operator fun component10(): Pwstr = this.pszMdmComplianceUrl

    public operator fun component11(): Pwstr = this.pszUserSettingSyncUrl

    public operator fun component12(): MutPtr = this.pUserInfo

    public fun copy(joinType: DsregJoinType = this.joinType, pJoinCertificate: ConstPtr = this.pJoinCertificate, pszDeviceId: Pwstr = this.pszDeviceId, pszIdpDomain: Pwstr = this.pszIdpDomain, pszTenantId: Pwstr = this.pszTenantId, pszJoinUserEmail: Pwstr = this.pszJoinUserEmail, pszTenantDisplayName: Pwstr = this.pszTenantDisplayName, pszMdmEnrollmentUrl: Pwstr = this.pszMdmEnrollmentUrl, pszMdmTermsOfUseUrl: Pwstr = this.pszMdmTermsOfUseUrl, pszMdmComplianceUrl: Pwstr = this.pszMdmComplianceUrl, pszUserSettingSyncUrl: Pwstr = this.pszUserSettingSyncUrl, pUserInfo: MutPtr = this.pUserInfo): DsregJoinInfo = DsregJoinInfo(joinType = joinType, pJoinCertificateCtorArg = pJoinCertificate, pszDeviceIdCtorArg = pszDeviceId, pszIdpDomainCtorArg = pszIdpDomain, pszTenantIdCtorArg = pszTenantId, pszJoinUserEmailCtorArg = pszJoinUserEmail, pszTenantDisplayNameCtorArg = pszTenantDisplayName, pszMdmEnrollmentUrlCtorArg = pszMdmEnrollmentUrl, pszMdmTermsOfUseUrlCtorArg = pszMdmTermsOfUseUrl, pszMdmComplianceUrlCtorArg = pszMdmComplianceUrl, pszUserSettingSyncUrlCtorArg = pszUserSettingSyncUrl, pUserInfoCtorArg = pUserInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsregJoinInfo) return false
        if (this.joinType != other.joinType) return false
        if (this.pJoinCertificate != other.pJoinCertificate) return false
        if (this.pszDeviceId != other.pszDeviceId) return false
        if (this.pszIdpDomain != other.pszIdpDomain) return false
        if (this.pszTenantId != other.pszTenantId) return false
        if (this.pszJoinUserEmail != other.pszJoinUserEmail) return false
        if (this.pszTenantDisplayName != other.pszTenantDisplayName) return false
        if (this.pszMdmEnrollmentUrl != other.pszMdmEnrollmentUrl) return false
        if (this.pszMdmTermsOfUseUrl != other.pszMdmTermsOfUseUrl) return false
        if (this.pszMdmComplianceUrl != other.pszMdmComplianceUrl) return false
        if (this.pszUserSettingSyncUrl != other.pszUserSettingSyncUrl) return false
        if (this.pUserInfo != other.pUserInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.joinType.hashCode()
        result = 31 * result + this.pJoinCertificate.hashCode()
        result = 31 * result + this.pszDeviceId.hashCode()
        result = 31 * result + this.pszIdpDomain.hashCode()
        result = 31 * result + this.pszTenantId.hashCode()
        result = 31 * result + this.pszJoinUserEmail.hashCode()
        result = 31 * result + this.pszTenantDisplayName.hashCode()
        result = 31 * result + this.pszMdmEnrollmentUrl.hashCode()
        result = 31 * result + this.pszMdmTermsOfUseUrl.hashCode()
        result = 31 * result + this.pszMdmComplianceUrl.hashCode()
        result = 31 * result + this.pszUserSettingSyncUrl.hashCode()
        result = 31 * result + this.pUserInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            joinType: DsregJoinType = 0,
            pJoinCertificate: ConstPtr = ConstPtr(0L),
            pszDeviceId: Pwstr = MutPtr(0L),
            pszIdpDomain: Pwstr = MutPtr(0L),
            pszTenantId: Pwstr = MutPtr(0L),
            pszJoinUserEmail: Pwstr = MutPtr(0L),
            pszTenantDisplayName: Pwstr = MutPtr(0L),
            pszMdmEnrollmentUrl: Pwstr = MutPtr(0L),
            pszMdmTermsOfUseUrl: Pwstr = MutPtr(0L),
            pszMdmComplianceUrl: Pwstr = MutPtr(0L),
            pszUserSettingSyncUrl: Pwstr = MutPtr(0L),
            pUserInfo: MutPtr = MutPtr(0L),
        ): DsregJoinInfo =
            DsregJoinInfo(
                joinType = joinType,
                pJoinCertificateCtorArg = pJoinCertificate,
                pszDeviceIdCtorArg = pszDeviceId,
                pszIdpDomainCtorArg = pszIdpDomain,
                pszTenantIdCtorArg = pszTenantId,
                pszJoinUserEmailCtorArg = pszJoinUserEmail,
                pszTenantDisplayNameCtorArg = pszTenantDisplayName,
                pszMdmEnrollmentUrlCtorArg = pszMdmEnrollmentUrl,
                pszMdmTermsOfUseUrlCtorArg = pszMdmTermsOfUseUrl,
                pszMdmComplianceUrlCtorArg = pszMdmComplianceUrl,
                pszUserSettingSyncUrlCtorArg = pszUserSettingSyncUrl,
                pUserInfoCtorArg = pUserInfo,
            )
    }
}

public class DsregUserInfo internal constructor(
    pszUserEmailCtorArg: Pwstr,
    pszUserKeyIdCtorArg: Pwstr,
    pszUserKeyNameCtorArg: Pwstr,
) {
    public var pszUserEmail: Pwstr = pszUserEmailCtorArg
        internal set

    public var pszUserKeyId: Pwstr = pszUserKeyIdCtorArg
        internal set

    public var pszUserKeyName: Pwstr = pszUserKeyNameCtorArg
        internal set

    public constructor() : this(
        pszUserEmailCtorArg = MutPtr(0L),
        pszUserKeyIdCtorArg = MutPtr(0L),
        pszUserKeyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszUserEmail

    public operator fun component2(): Pwstr = this.pszUserKeyId

    public operator fun component3(): Pwstr = this.pszUserKeyName

    public fun copy(pszUserEmail: Pwstr = this.pszUserEmail, pszUserKeyId: Pwstr = this.pszUserKeyId, pszUserKeyName: Pwstr = this.pszUserKeyName): DsregUserInfo = DsregUserInfo(pszUserEmailCtorArg = pszUserEmail, pszUserKeyIdCtorArg = pszUserKeyId, pszUserKeyNameCtorArg = pszUserKeyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsregUserInfo) return false
        if (this.pszUserEmail != other.pszUserEmail) return false
        if (this.pszUserKeyId != other.pszUserKeyId) return false
        if (this.pszUserKeyName != other.pszUserKeyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUserEmail.hashCode()
        result = 31 * result + this.pszUserKeyId.hashCode()
        result = 31 * result + this.pszUserKeyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUserEmail: Pwstr = MutPtr(0L),
            pszUserKeyId: Pwstr = MutPtr(0L),
            pszUserKeyName: Pwstr = MutPtr(0L),
        ): DsregUserInfo =
            DsregUserInfo(
                pszUserEmailCtorArg = pszUserEmail,
                pszUserKeyIdCtorArg = pszUserKeyId,
                pszUserKeyNameCtorArg = pszUserKeyName,
            )
    }
}

public data class ErrlogOtherInfo(
    public var alrterErrcode: UInt = 0u,
    public var alrterOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrlogOtherInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrlogOtherInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ErrlogOtherInfo =
                    ErrlogOtherInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ErrlogOtherInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alrterErrcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alrterOffset)
                }
            }
    }
}

public class ErrorLog internal constructor(
    public var elLen: UInt,
    public var elReserved: UInt,
    public var elTime: UInt,
    public var elError: UInt,
    elNameCtorArg: Pwstr,
    elTextCtorArg: Pwstr,
    elDataCtorArg: MutPtr,
    public var elDataSize: UInt,
    public var elNstrings: UInt,
) {
    public var elName: Pwstr = elNameCtorArg
        internal set

    public var elText: Pwstr = elTextCtorArg
        internal set

    public var elData: MutPtr = elDataCtorArg
        internal set

    public constructor() : this(
        elLen = 0u,
        elReserved = 0u,
        elTime = 0u,
        elError = 0u,
        elNameCtorArg = MutPtr(0L),
        elTextCtorArg = MutPtr(0L),
        elDataCtorArg = MutPtr(0L),
        elDataSize = 0u,
        elNstrings = 0u,
    )

    public operator fun component1(): UInt = this.elLen

    public operator fun component2(): UInt = this.elReserved

    public operator fun component3(): UInt = this.elTime

    public operator fun component4(): UInt = this.elError

    public operator fun component5(): Pwstr = this.elName

    public operator fun component6(): Pwstr = this.elText

    public operator fun component7(): MutPtr = this.elData

    public operator fun component8(): UInt = this.elDataSize

    public operator fun component9(): UInt = this.elNstrings

    public fun copy(elLen: UInt = this.elLen, elReserved: UInt = this.elReserved, elTime: UInt = this.elTime, elError: UInt = this.elError, elName: Pwstr = this.elName, elText: Pwstr = this.elText, elData: MutPtr = this.elData, elDataSize: UInt = this.elDataSize, elNstrings: UInt = this.elNstrings): ErrorLog = ErrorLog(elLen = elLen, elReserved = elReserved, elTime = elTime, elError = elError, elNameCtorArg = elName, elTextCtorArg = elText, elDataCtorArg = elData, elDataSize = elDataSize, elNstrings = elNstrings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ErrorLog) return false
        if (this.elLen != other.elLen) return false
        if (this.elReserved != other.elReserved) return false
        if (this.elTime != other.elTime) return false
        if (this.elError != other.elError) return false
        if (this.elName != other.elName) return false
        if (this.elText != other.elText) return false
        if (this.elData != other.elData) return false
        if (this.elDataSize != other.elDataSize) return false
        if (this.elNstrings != other.elNstrings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elLen.hashCode()
        result = 31 * result + this.elReserved.hashCode()
        result = 31 * result + this.elTime.hashCode()
        result = 31 * result + this.elError.hashCode()
        result = 31 * result + this.elName.hashCode()
        result = 31 * result + this.elText.hashCode()
        result = 31 * result + this.elData.hashCode()
        result = 31 * result + this.elDataSize.hashCode()
        result = 31 * result + this.elNstrings.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            elLen: UInt = 0u,
            elReserved: UInt = 0u,
            elTime: UInt = 0u,
            elError: UInt = 0u,
            elName: Pwstr = MutPtr(0L),
            elText: Pwstr = MutPtr(0L),
            elData: MutPtr = MutPtr(0L),
            elDataSize: UInt = 0u,
            elNstrings: UInt = 0u,
        ): ErrorLog =
            ErrorLog(
                elLen = elLen,
                elReserved = elReserved,
                elTime = elTime,
                elError = elError,
                elNameCtorArg = elName,
                elTextCtorArg = elText,
                elDataCtorArg = elData,
                elDataSize = elDataSize,
                elNstrings = elNstrings,
            )
    }
}

public data class FlatString(
    public var maximumLength: Short = 0,
    public var length: Short = 0,
    public var buffer: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlatString) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlatString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlatString> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): FlatString =
                    FlatString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: FlatString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 4L, value.buffer.toList())
                }
            }
    }
}

public class GroupInfo0 internal constructor(
    grpi0NameCtorArg: Pwstr,
) {
    public var grpi0Name: Pwstr = grpi0NameCtorArg
        internal set

    public constructor() : this(
        grpi0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.grpi0Name

    public fun copy(grpi0Name: Pwstr = this.grpi0Name): GroupInfo0 = GroupInfo0(grpi0NameCtorArg = grpi0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupInfo0) return false
        if (this.grpi0Name != other.grpi0Name) return false
        return true
    }

    override fun hashCode(): Int = this.grpi0Name.hashCode()

    public companion object {
        public operator fun invoke(
            grpi0Name: Pwstr = MutPtr(0L),
        ): GroupInfo0 =
            GroupInfo0(
                grpi0NameCtorArg = grpi0Name,
            )
    }
}

public class GroupInfo1 internal constructor(
    grpi1NameCtorArg: Pwstr,
    grpi1CommentCtorArg: Pwstr,
) {
    public var grpi1Name: Pwstr = grpi1NameCtorArg
        internal set

    public var grpi1Comment: Pwstr = grpi1CommentCtorArg
        internal set

    public constructor() : this(
        grpi1NameCtorArg = MutPtr(0L),
        grpi1CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.grpi1Name

    public operator fun component2(): Pwstr = this.grpi1Comment

    public fun copy(grpi1Name: Pwstr = this.grpi1Name, grpi1Comment: Pwstr = this.grpi1Comment): GroupInfo1 = GroupInfo1(grpi1NameCtorArg = grpi1Name, grpi1CommentCtorArg = grpi1Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupInfo1) return false
        if (this.grpi1Name != other.grpi1Name) return false
        if (this.grpi1Comment != other.grpi1Comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grpi1Name.hashCode()
        result = 31 * result + this.grpi1Comment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            grpi1Name: Pwstr = MutPtr(0L),
            grpi1Comment: Pwstr = MutPtr(0L),
        ): GroupInfo1 =
            GroupInfo1(
                grpi1NameCtorArg = grpi1Name,
                grpi1CommentCtorArg = grpi1Comment,
            )
    }
}

public class GroupInfo1002 internal constructor(
    grpi1002CommentCtorArg: Pwstr,
) {
    public var grpi1002Comment: Pwstr = grpi1002CommentCtorArg
        internal set

    public constructor() : this(
        grpi1002CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.grpi1002Comment

    public fun copy(grpi1002Comment: Pwstr = this.grpi1002Comment): GroupInfo1002 = GroupInfo1002(grpi1002CommentCtorArg = grpi1002Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupInfo1002) return false
        if (this.grpi1002Comment != other.grpi1002Comment) return false
        return true
    }

    override fun hashCode(): Int = this.grpi1002Comment.hashCode()

    public companion object {
        public operator fun invoke(
            grpi1002Comment: Pwstr = MutPtr(0L),
        ): GroupInfo1002 =
            GroupInfo1002(
                grpi1002CommentCtorArg = grpi1002Comment,
            )
    }
}

public data class GroupInfo1005(
    public var grpi1005Attributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupInfo1005> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupInfo1005> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): GroupInfo1005 =
                    GroupInfo1005(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GroupInfo1005) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grpi1005Attributes)
                }
            }
    }
}

public class GroupInfo2 internal constructor(
    grpi2NameCtorArg: Pwstr,
    grpi2CommentCtorArg: Pwstr,
    public var grpi2GroupId: UInt,
    public var grpi2Attributes: UInt,
) {
    public var grpi2Name: Pwstr = grpi2NameCtorArg
        internal set

    public var grpi2Comment: Pwstr = grpi2CommentCtorArg
        internal set

    public constructor() : this(
        grpi2NameCtorArg = MutPtr(0L),
        grpi2CommentCtorArg = MutPtr(0L),
        grpi2GroupId = 0u,
        grpi2Attributes = 0u,
    )

    public operator fun component1(): Pwstr = this.grpi2Name

    public operator fun component2(): Pwstr = this.grpi2Comment

    public operator fun component3(): UInt = this.grpi2GroupId

    public operator fun component4(): UInt = this.grpi2Attributes

    public fun copy(grpi2Name: Pwstr = this.grpi2Name, grpi2Comment: Pwstr = this.grpi2Comment, grpi2GroupId: UInt = this.grpi2GroupId, grpi2Attributes: UInt = this.grpi2Attributes): GroupInfo2 = GroupInfo2(grpi2NameCtorArg = grpi2Name, grpi2CommentCtorArg = grpi2Comment, grpi2GroupId = grpi2GroupId, grpi2Attributes = grpi2Attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupInfo2) return false
        if (this.grpi2Name != other.grpi2Name) return false
        if (this.grpi2Comment != other.grpi2Comment) return false
        if (this.grpi2GroupId != other.grpi2GroupId) return false
        if (this.grpi2Attributes != other.grpi2Attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grpi2Name.hashCode()
        result = 31 * result + this.grpi2Comment.hashCode()
        result = 31 * result + this.grpi2GroupId.hashCode()
        result = 31 * result + this.grpi2Attributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            grpi2Name: Pwstr = MutPtr(0L),
            grpi2Comment: Pwstr = MutPtr(0L),
            grpi2GroupId: UInt = 0u,
            grpi2Attributes: UInt = 0u,
        ): GroupInfo2 =
            GroupInfo2(
                grpi2NameCtorArg = grpi2Name,
                grpi2CommentCtorArg = grpi2Comment,
                grpi2GroupId = grpi2GroupId,
                grpi2Attributes = grpi2Attributes,
            )
    }
}

public class GroupInfo3 internal constructor(
    grpi3NameCtorArg: Pwstr,
    grpi3CommentCtorArg: Pwstr,
    grpi3GroupSidCtorArg: Psid,
    public var grpi3Attributes: UInt,
) {
    public var grpi3Name: Pwstr = grpi3NameCtorArg
        internal set

    public var grpi3Comment: Pwstr = grpi3CommentCtorArg
        internal set

    public var grpi3GroupSid: Psid = grpi3GroupSidCtorArg
        internal set

    public constructor() : this(
        grpi3NameCtorArg = MutPtr(0L),
        grpi3CommentCtorArg = MutPtr(0L),
        grpi3GroupSidCtorArg = MutPtr(0L),
        grpi3Attributes = 0u,
    )

    public operator fun component1(): Pwstr = this.grpi3Name

    public operator fun component2(): Pwstr = this.grpi3Comment

    public operator fun component3(): Psid = this.grpi3GroupSid

    public operator fun component4(): UInt = this.grpi3Attributes

    public fun copy(grpi3Name: Pwstr = this.grpi3Name, grpi3Comment: Pwstr = this.grpi3Comment, grpi3GroupSid: Psid = this.grpi3GroupSid, grpi3Attributes: UInt = this.grpi3Attributes): GroupInfo3 = GroupInfo3(grpi3NameCtorArg = grpi3Name, grpi3CommentCtorArg = grpi3Comment, grpi3GroupSidCtorArg = grpi3GroupSid, grpi3Attributes = grpi3Attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupInfo3) return false
        if (this.grpi3Name != other.grpi3Name) return false
        if (this.grpi3Comment != other.grpi3Comment) return false
        if (this.grpi3GroupSid != other.grpi3GroupSid) return false
        if (this.grpi3Attributes != other.grpi3Attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grpi3Name.hashCode()
        result = 31 * result + this.grpi3Comment.hashCode()
        result = 31 * result + this.grpi3GroupSid.hashCode()
        result = 31 * result + this.grpi3Attributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            grpi3Name: Pwstr = MutPtr(0L),
            grpi3Comment: Pwstr = MutPtr(0L),
            grpi3GroupSid: Psid = MutPtr(0L),
            grpi3Attributes: UInt = 0u,
        ): GroupInfo3 =
            GroupInfo3(
                grpi3NameCtorArg = grpi3Name,
                grpi3CommentCtorArg = grpi3Comment,
                grpi3GroupSidCtorArg = grpi3GroupSid,
                grpi3Attributes = grpi3Attributes,
            )
    }
}

public class GroupUsersInfo0 internal constructor(
    grui0NameCtorArg: Pwstr,
) {
    public var grui0Name: Pwstr = grui0NameCtorArg
        internal set

    public constructor() : this(
        grui0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.grui0Name

    public fun copy(grui0Name: Pwstr = this.grui0Name): GroupUsersInfo0 = GroupUsersInfo0(grui0NameCtorArg = grui0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupUsersInfo0) return false
        if (this.grui0Name != other.grui0Name) return false
        return true
    }

    override fun hashCode(): Int = this.grui0Name.hashCode()

    public companion object {
        public operator fun invoke(
            grui0Name: Pwstr = MutPtr(0L),
        ): GroupUsersInfo0 =
            GroupUsersInfo0(
                grui0NameCtorArg = grui0Name,
            )
    }
}

public class GroupUsersInfo1 internal constructor(
    grui1NameCtorArg: Pwstr,
    public var grui1Attributes: UInt,
) {
    public var grui1Name: Pwstr = grui1NameCtorArg
        internal set

    public constructor() : this(
        grui1NameCtorArg = MutPtr(0L),
        grui1Attributes = 0u,
    )

    public operator fun component1(): Pwstr = this.grui1Name

    public operator fun component2(): UInt = this.grui1Attributes

    public fun copy(grui1Name: Pwstr = this.grui1Name, grui1Attributes: UInt = this.grui1Attributes): GroupUsersInfo1 = GroupUsersInfo1(grui1NameCtorArg = grui1Name, grui1Attributes = grui1Attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupUsersInfo1) return false
        if (this.grui1Name != other.grui1Name) return false
        if (this.grui1Attributes != other.grui1Attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grui1Name.hashCode()
        result = 31 * result + this.grui1Attributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            grui1Name: Pwstr = MutPtr(0L),
            grui1Attributes: UInt = 0u,
        ): GroupUsersInfo1 =
            GroupUsersInfo1(
                grui1NameCtorArg = grui1Name,
                grui1Attributes = grui1Attributes,
            )
    }
}

public data class HardwareAddress(
    public var address: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HardwareAddress) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int = this.address.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HardwareAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HardwareAddress> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): HardwareAddress =
                    HardwareAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: HardwareAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.address.toList())
                }
            }
    }
}

public data class Hlog(
    public var time: UInt = 0u,
    public var lastFlags: UInt = 0u,
    public var offset: UInt = 0u,
    public var recOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hlog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hlog> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Hlog =
                    Hlog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Hlog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lastFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.recOffset)
                }
            }
    }
}

public class LocalgroupInfo0 internal constructor(
    lgrpi0NameCtorArg: Pwstr,
) {
    public var lgrpi0Name: Pwstr = lgrpi0NameCtorArg
        internal set

    public constructor() : this(
        lgrpi0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lgrpi0Name

    public fun copy(lgrpi0Name: Pwstr = this.lgrpi0Name): LocalgroupInfo0 = LocalgroupInfo0(lgrpi0NameCtorArg = lgrpi0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupInfo0) return false
        if (this.lgrpi0Name != other.lgrpi0Name) return false
        return true
    }

    override fun hashCode(): Int = this.lgrpi0Name.hashCode()

    public companion object {
        public operator fun invoke(
            lgrpi0Name: Pwstr = MutPtr(0L),
        ): LocalgroupInfo0 =
            LocalgroupInfo0(
                lgrpi0NameCtorArg = lgrpi0Name,
            )
    }
}

public class LocalgroupInfo1 internal constructor(
    lgrpi1NameCtorArg: Pwstr,
    lgrpi1CommentCtorArg: Pwstr,
) {
    public var lgrpi1Name: Pwstr = lgrpi1NameCtorArg
        internal set

    public var lgrpi1Comment: Pwstr = lgrpi1CommentCtorArg
        internal set

    public constructor() : this(
        lgrpi1NameCtorArg = MutPtr(0L),
        lgrpi1CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lgrpi1Name

    public operator fun component2(): Pwstr = this.lgrpi1Comment

    public fun copy(lgrpi1Name: Pwstr = this.lgrpi1Name, lgrpi1Comment: Pwstr = this.lgrpi1Comment): LocalgroupInfo1 = LocalgroupInfo1(lgrpi1NameCtorArg = lgrpi1Name, lgrpi1CommentCtorArg = lgrpi1Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupInfo1) return false
        if (this.lgrpi1Name != other.lgrpi1Name) return false
        if (this.lgrpi1Comment != other.lgrpi1Comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lgrpi1Name.hashCode()
        result = 31 * result + this.lgrpi1Comment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lgrpi1Name: Pwstr = MutPtr(0L),
            lgrpi1Comment: Pwstr = MutPtr(0L),
        ): LocalgroupInfo1 =
            LocalgroupInfo1(
                lgrpi1NameCtorArg = lgrpi1Name,
                lgrpi1CommentCtorArg = lgrpi1Comment,
            )
    }
}

public class LocalgroupInfo1002 internal constructor(
    lgrpi1002CommentCtorArg: Pwstr,
) {
    public var lgrpi1002Comment: Pwstr = lgrpi1002CommentCtorArg
        internal set

    public constructor() : this(
        lgrpi1002CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lgrpi1002Comment

    public fun copy(lgrpi1002Comment: Pwstr = this.lgrpi1002Comment): LocalgroupInfo1002 = LocalgroupInfo1002(lgrpi1002CommentCtorArg = lgrpi1002Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupInfo1002) return false
        if (this.lgrpi1002Comment != other.lgrpi1002Comment) return false
        return true
    }

    override fun hashCode(): Int = this.lgrpi1002Comment.hashCode()

    public companion object {
        public operator fun invoke(
            lgrpi1002Comment: Pwstr = MutPtr(0L),
        ): LocalgroupInfo1002 =
            LocalgroupInfo1002(
                lgrpi1002CommentCtorArg = lgrpi1002Comment,
            )
    }
}

public class LocalgroupMembersInfo0 internal constructor(
    lgrmi0SidCtorArg: Psid,
) {
    public var lgrmi0Sid: Psid = lgrmi0SidCtorArg
        internal set

    public constructor() : this(
        lgrmi0SidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.lgrmi0Sid

    public fun copy(lgrmi0Sid: Psid = this.lgrmi0Sid): LocalgroupMembersInfo0 = LocalgroupMembersInfo0(lgrmi0SidCtorArg = lgrmi0Sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupMembersInfo0) return false
        if (this.lgrmi0Sid != other.lgrmi0Sid) return false
        return true
    }

    override fun hashCode(): Int = this.lgrmi0Sid.hashCode()

    public companion object {
        public operator fun invoke(
            lgrmi0Sid: Psid = MutPtr(0L),
        ): LocalgroupMembersInfo0 =
            LocalgroupMembersInfo0(
                lgrmi0SidCtorArg = lgrmi0Sid,
            )
    }
}

public class LocalgroupMembersInfo1 internal constructor(
    lgrmi1SidCtorArg: Psid,
    public var lgrmi1Sidusage: SidNameUse,
    lgrmi1NameCtorArg: Pwstr,
) {
    public var lgrmi1Sid: Psid = lgrmi1SidCtorArg
        internal set

    public var lgrmi1Name: Pwstr = lgrmi1NameCtorArg
        internal set

    public constructor() : this(
        lgrmi1SidCtorArg = MutPtr(0L),
        lgrmi1Sidusage = 0,
        lgrmi1NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.lgrmi1Sid

    public operator fun component2(): SidNameUse = this.lgrmi1Sidusage

    public operator fun component3(): Pwstr = this.lgrmi1Name

    public fun copy(lgrmi1Sid: Psid = this.lgrmi1Sid, lgrmi1Sidusage: SidNameUse = this.lgrmi1Sidusage, lgrmi1Name: Pwstr = this.lgrmi1Name): LocalgroupMembersInfo1 = LocalgroupMembersInfo1(lgrmi1SidCtorArg = lgrmi1Sid, lgrmi1Sidusage = lgrmi1Sidusage, lgrmi1NameCtorArg = lgrmi1Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupMembersInfo1) return false
        if (this.lgrmi1Sid != other.lgrmi1Sid) return false
        if (this.lgrmi1Sidusage != other.lgrmi1Sidusage) return false
        if (this.lgrmi1Name != other.lgrmi1Name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lgrmi1Sid.hashCode()
        result = 31 * result + this.lgrmi1Sidusage.hashCode()
        result = 31 * result + this.lgrmi1Name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lgrmi1Sid: Psid = MutPtr(0L),
            lgrmi1Sidusage: SidNameUse = 0,
            lgrmi1Name: Pwstr = MutPtr(0L),
        ): LocalgroupMembersInfo1 =
            LocalgroupMembersInfo1(
                lgrmi1SidCtorArg = lgrmi1Sid,
                lgrmi1Sidusage = lgrmi1Sidusage,
                lgrmi1NameCtorArg = lgrmi1Name,
            )
    }
}

public class LocalgroupMembersInfo2 internal constructor(
    lgrmi2SidCtorArg: Psid,
    public var lgrmi2Sidusage: SidNameUse,
    lgrmi2DomainandnameCtorArg: Pwstr,
) {
    public var lgrmi2Sid: Psid = lgrmi2SidCtorArg
        internal set

    public var lgrmi2Domainandname: Pwstr = lgrmi2DomainandnameCtorArg
        internal set

    public constructor() : this(
        lgrmi2SidCtorArg = MutPtr(0L),
        lgrmi2Sidusage = 0,
        lgrmi2DomainandnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.lgrmi2Sid

    public operator fun component2(): SidNameUse = this.lgrmi2Sidusage

    public operator fun component3(): Pwstr = this.lgrmi2Domainandname

    public fun copy(lgrmi2Sid: Psid = this.lgrmi2Sid, lgrmi2Sidusage: SidNameUse = this.lgrmi2Sidusage, lgrmi2Domainandname: Pwstr = this.lgrmi2Domainandname): LocalgroupMembersInfo2 = LocalgroupMembersInfo2(lgrmi2SidCtorArg = lgrmi2Sid, lgrmi2Sidusage = lgrmi2Sidusage, lgrmi2DomainandnameCtorArg = lgrmi2Domainandname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupMembersInfo2) return false
        if (this.lgrmi2Sid != other.lgrmi2Sid) return false
        if (this.lgrmi2Sidusage != other.lgrmi2Sidusage) return false
        if (this.lgrmi2Domainandname != other.lgrmi2Domainandname) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lgrmi2Sid.hashCode()
        result = 31 * result + this.lgrmi2Sidusage.hashCode()
        result = 31 * result + this.lgrmi2Domainandname.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lgrmi2Sid: Psid = MutPtr(0L),
            lgrmi2Sidusage: SidNameUse = 0,
            lgrmi2Domainandname: Pwstr = MutPtr(0L),
        ): LocalgroupMembersInfo2 =
            LocalgroupMembersInfo2(
                lgrmi2SidCtorArg = lgrmi2Sid,
                lgrmi2Sidusage = lgrmi2Sidusage,
                lgrmi2DomainandnameCtorArg = lgrmi2Domainandname,
            )
    }
}

public class LocalgroupMembersInfo3 internal constructor(
    lgrmi3DomainandnameCtorArg: Pwstr,
) {
    public var lgrmi3Domainandname: Pwstr = lgrmi3DomainandnameCtorArg
        internal set

    public constructor() : this(
        lgrmi3DomainandnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lgrmi3Domainandname

    public fun copy(lgrmi3Domainandname: Pwstr = this.lgrmi3Domainandname): LocalgroupMembersInfo3 = LocalgroupMembersInfo3(lgrmi3DomainandnameCtorArg = lgrmi3Domainandname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupMembersInfo3) return false
        if (this.lgrmi3Domainandname != other.lgrmi3Domainandname) return false
        return true
    }

    override fun hashCode(): Int = this.lgrmi3Domainandname.hashCode()

    public companion object {
        public operator fun invoke(
            lgrmi3Domainandname: Pwstr = MutPtr(0L),
        ): LocalgroupMembersInfo3 =
            LocalgroupMembersInfo3(
                lgrmi3DomainandnameCtorArg = lgrmi3Domainandname,
            )
    }
}

public class LocalgroupUsersInfo0 internal constructor(
    lgrui0NameCtorArg: Pwstr,
) {
    public var lgrui0Name: Pwstr = lgrui0NameCtorArg
        internal set

    public constructor() : this(
        lgrui0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lgrui0Name

    public fun copy(lgrui0Name: Pwstr = this.lgrui0Name): LocalgroupUsersInfo0 = LocalgroupUsersInfo0(lgrui0NameCtorArg = lgrui0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LocalgroupUsersInfo0) return false
        if (this.lgrui0Name != other.lgrui0Name) return false
        return true
    }

    override fun hashCode(): Int = this.lgrui0Name.hashCode()

    public companion object {
        public operator fun invoke(
            lgrui0Name: Pwstr = MutPtr(0L),
        ): LocalgroupUsersInfo0 =
            LocalgroupUsersInfo0(
                lgrui0NameCtorArg = lgrui0Name,
            )
    }
}

public data class MprProtocol0(
    public var dwProtocolId: UInt = 0u,
    public var wszProtocol: UShortArray = UShortArray(41),
    public var wszDLLName: UShortArray = UShortArray(49),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprProtocol0) return false
        if (this.dwProtocolId != other.dwProtocolId) return false
        if (!this.wszProtocol.contentEquals(other.wszProtocol)) return false
        if (!this.wszDLLName.contentEquals(other.wszDLLName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProtocolId.hashCode()
        result = 31 * result + this.wszProtocol.contentHashCode()
        result = 31 * result + this.wszDLLName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprProtocol0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprProtocol0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 184L
                override fun readNative(addr: Long): MprProtocol0 =
                    MprProtocol0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (41).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (49).toInt())
                        ).readNative(addr + 86L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MprProtocol0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProtocolId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (41).toInt())
                    ).writeNative(addr + 4L, value.wszProtocol.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (49).toInt())
                    ).writeNative(addr + 86L, value.wszDLLName.toList())
                }
            }
    }
}

public data class MsaInfo0(
    public var state: MsaInfoState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsaInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsaInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MsaInfo0 =
                    MsaInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MsaInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                }
            }
    }
}

public class MsgInfo0 internal constructor(
    msgi0NameCtorArg: Pwstr,
) {
    public var msgi0Name: Pwstr = msgi0NameCtorArg
        internal set

    public constructor() : this(
        msgi0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.msgi0Name

    public fun copy(msgi0Name: Pwstr = this.msgi0Name): MsgInfo0 = MsgInfo0(msgi0NameCtorArg = msgi0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsgInfo0) return false
        if (this.msgi0Name != other.msgi0Name) return false
        return true
    }

    override fun hashCode(): Int = this.msgi0Name.hashCode()

    public companion object {
        public operator fun invoke(
            msgi0Name: Pwstr = MutPtr(0L),
        ): MsgInfo0 =
            MsgInfo0(
                msgi0NameCtorArg = msgi0Name,
            )
    }
}

public class MsgInfo1 internal constructor(
    msgi1NameCtorArg: Pwstr,
    public var msgi1ForwardFlag: UInt,
    msgi1ForwardCtorArg: Pwstr,
) {
    public var msgi1Name: Pwstr = msgi1NameCtorArg
        internal set

    public var msgi1Forward: Pwstr = msgi1ForwardCtorArg
        internal set

    public constructor() : this(
        msgi1NameCtorArg = MutPtr(0L),
        msgi1ForwardFlag = 0u,
        msgi1ForwardCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.msgi1Name

    public operator fun component2(): UInt = this.msgi1ForwardFlag

    public operator fun component3(): Pwstr = this.msgi1Forward

    public fun copy(msgi1Name: Pwstr = this.msgi1Name, msgi1ForwardFlag: UInt = this.msgi1ForwardFlag, msgi1Forward: Pwstr = this.msgi1Forward): MsgInfo1 = MsgInfo1(msgi1NameCtorArg = msgi1Name, msgi1ForwardFlag = msgi1ForwardFlag, msgi1ForwardCtorArg = msgi1Forward)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsgInfo1) return false
        if (this.msgi1Name != other.msgi1Name) return false
        if (this.msgi1ForwardFlag != other.msgi1ForwardFlag) return false
        if (this.msgi1Forward != other.msgi1Forward) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgi1Name.hashCode()
        result = 31 * result + this.msgi1ForwardFlag.hashCode()
        result = 31 * result + this.msgi1Forward.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            msgi1Name: Pwstr = MutPtr(0L),
            msgi1ForwardFlag: UInt = 0u,
            msgi1Forward: Pwstr = MutPtr(0L),
        ): MsgInfo1 =
            MsgInfo1(
                msgi1NameCtorArg = msgi1Name,
                msgi1ForwardFlag = msgi1ForwardFlag,
                msgi1ForwardCtorArg = msgi1Forward,
            )
    }
}

public data class NetlogonInfo1(
    public var netlog1Flags: UInt = 0u,
    public var netlog1PdcConnectionStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetlogonInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetlogonInfo1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NetlogonInfo1 =
                    NetlogonInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetlogonInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.netlog1Flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.netlog1PdcConnectionStatus)
                }
            }
    }
}

public class NetlogonInfo2 internal constructor(
    public var netlog2Flags: UInt,
    public var netlog2PdcConnectionStatus: UInt,
    netlog2TrustedDcNameCtorArg: Pwstr,
    public var netlog2TcConnectionStatus: UInt,
) {
    public var netlog2TrustedDcName: Pwstr = netlog2TrustedDcNameCtorArg
        internal set

    public constructor() : this(
        netlog2Flags = 0u,
        netlog2PdcConnectionStatus = 0u,
        netlog2TrustedDcNameCtorArg = MutPtr(0L),
        netlog2TcConnectionStatus = 0u,
    )

    public operator fun component1(): UInt = this.netlog2Flags

    public operator fun component2(): UInt = this.netlog2PdcConnectionStatus

    public operator fun component3(): Pwstr = this.netlog2TrustedDcName

    public operator fun component4(): UInt = this.netlog2TcConnectionStatus

    public fun copy(netlog2Flags: UInt = this.netlog2Flags, netlog2PdcConnectionStatus: UInt = this.netlog2PdcConnectionStatus, netlog2TrustedDcName: Pwstr = this.netlog2TrustedDcName, netlog2TcConnectionStatus: UInt = this.netlog2TcConnectionStatus): NetlogonInfo2 = NetlogonInfo2(netlog2Flags = netlog2Flags, netlog2PdcConnectionStatus = netlog2PdcConnectionStatus, netlog2TrustedDcNameCtorArg = netlog2TrustedDcName, netlog2TcConnectionStatus = netlog2TcConnectionStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetlogonInfo2) return false
        if (this.netlog2Flags != other.netlog2Flags) return false
        if (this.netlog2PdcConnectionStatus != other.netlog2PdcConnectionStatus) return false
        if (this.netlog2TrustedDcName != other.netlog2TrustedDcName) return false
        if (this.netlog2TcConnectionStatus != other.netlog2TcConnectionStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netlog2Flags.hashCode()
        result = 31 * result + this.netlog2PdcConnectionStatus.hashCode()
        result = 31 * result + this.netlog2TrustedDcName.hashCode()
        result = 31 * result + this.netlog2TcConnectionStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netlog2Flags: UInt = 0u,
            netlog2PdcConnectionStatus: UInt = 0u,
            netlog2TrustedDcName: Pwstr = MutPtr(0L),
            netlog2TcConnectionStatus: UInt = 0u,
        ): NetlogonInfo2 =
            NetlogonInfo2(
                netlog2Flags = netlog2Flags,
                netlog2PdcConnectionStatus = netlog2PdcConnectionStatus,
                netlog2TrustedDcNameCtorArg = netlog2TrustedDcName,
                netlog2TcConnectionStatus = netlog2TcConnectionStatus,
            )
    }
}

public data class NetlogonInfo3(
    public var netlog3Flags: UInt = 0u,
    public var netlog3LogonAttempts: UInt = 0u,
    public var netlog3Reserved1: UInt = 0u,
    public var netlog3Reserved2: UInt = 0u,
    public var netlog3Reserved3: UInt = 0u,
    public var netlog3Reserved4: UInt = 0u,
    public var netlog3Reserved5: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetlogonInfo3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetlogonInfo3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NetlogonInfo3 =
                    NetlogonInfo3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NetlogonInfo3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.netlog3Flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.netlog3LogonAttempts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.netlog3Reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.netlog3Reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.netlog3Reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.netlog3Reserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.netlog3Reserved5)
                }
            }
    }
}

public class NetlogonInfo4 internal constructor(
    netlog4TrustedDcNameCtorArg: Pwstr,
    netlog4TrustedDomainNameCtorArg: Pwstr,
) {
    public var netlog4TrustedDcName: Pwstr = netlog4TrustedDcNameCtorArg
        internal set

    public var netlog4TrustedDomainName: Pwstr = netlog4TrustedDomainNameCtorArg
        internal set

    public constructor() : this(
        netlog4TrustedDcNameCtorArg = MutPtr(0L),
        netlog4TrustedDomainNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.netlog4TrustedDcName

    public operator fun component2(): Pwstr = this.netlog4TrustedDomainName

    public fun copy(netlog4TrustedDcName: Pwstr = this.netlog4TrustedDcName, netlog4TrustedDomainName: Pwstr = this.netlog4TrustedDomainName): NetlogonInfo4 = NetlogonInfo4(netlog4TrustedDcNameCtorArg = netlog4TrustedDcName, netlog4TrustedDomainNameCtorArg = netlog4TrustedDomainName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetlogonInfo4) return false
        if (this.netlog4TrustedDcName != other.netlog4TrustedDcName) return false
        if (this.netlog4TrustedDomainName != other.netlog4TrustedDomainName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netlog4TrustedDcName.hashCode()
        result = 31 * result + this.netlog4TrustedDomainName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            netlog4TrustedDcName: Pwstr = MutPtr(0L),
            netlog4TrustedDomainName: Pwstr = MutPtr(0L),
        ): NetlogonInfo4 =
            NetlogonInfo4(
                netlog4TrustedDcNameCtorArg = netlog4TrustedDcName,
                netlog4TrustedDomainNameCtorArg = netlog4TrustedDomainName,
            )
    }
}

public class NetsetupProvisioningParams internal constructor(
    public var dwVersion: UInt,
    lpDomainCtorArg: Pcwstr,
    lpHostNameCtorArg: Pcwstr,
    lpMachineAccountOUCtorArg: Pcwstr,
    lpDcNameCtorArg: Pcwstr,
    public var dwProvisionOptions: NetsetupProvision,
    aCertTemplateNamesCtorArg: ConstPtr,
    public var cCertTemplateNames: UInt,
    aMachinePolicyNamesCtorArg: ConstPtr,
    public var cMachinePolicyNames: UInt,
    aMachinePolicyPathsCtorArg: ConstPtr,
    public var cMachinePolicyPaths: UInt,
    lpNetbiosNameCtorArg: Pwstr,
    lpSiteNameCtorArg: Pwstr,
    lpPrimaryDNSDomainCtorArg: Pwstr,
) {
    public var lpDomain: Pcwstr = lpDomainCtorArg
        internal set

    public var lpHostName: Pcwstr = lpHostNameCtorArg
        internal set

    public var lpMachineAccountOU: Pcwstr = lpMachineAccountOUCtorArg
        internal set

    public var lpDcName: Pcwstr = lpDcNameCtorArg
        internal set

    public var aCertTemplateNames: ConstPtr = aCertTemplateNamesCtorArg
        internal set

    public var aMachinePolicyNames: ConstPtr = aMachinePolicyNamesCtorArg
        internal set

    public var aMachinePolicyPaths: ConstPtr = aMachinePolicyPathsCtorArg
        internal set

    public var lpNetbiosName: Pwstr = lpNetbiosNameCtorArg
        internal set

    public var lpSiteName: Pwstr = lpSiteNameCtorArg
        internal set

    public var lpPrimaryDNSDomain: Pwstr = lpPrimaryDNSDomainCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        lpDomainCtorArg = ConstPtr(0L),
        lpHostNameCtorArg = ConstPtr(0L),
        lpMachineAccountOUCtorArg = ConstPtr(0L),
        lpDcNameCtorArg = ConstPtr(0L),
        dwProvisionOptions = 0u,
        aCertTemplateNamesCtorArg = ConstPtr(0L),
        cCertTemplateNames = 0u,
        aMachinePolicyNamesCtorArg = ConstPtr(0L),
        cMachinePolicyNames = 0u,
        aMachinePolicyPathsCtorArg = ConstPtr(0L),
        cMachinePolicyPaths = 0u,
        lpNetbiosNameCtorArg = MutPtr(0L),
        lpSiteNameCtorArg = MutPtr(0L),
        lpPrimaryDNSDomainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.lpDomain

    public operator fun component3(): Pcwstr = this.lpHostName

    public operator fun component4(): Pcwstr = this.lpMachineAccountOU

    public operator fun component5(): Pcwstr = this.lpDcName

    public operator fun component6(): NetsetupProvision = this.dwProvisionOptions

    public operator fun component7(): ConstPtr = this.aCertTemplateNames

    public operator fun component8(): UInt = this.cCertTemplateNames

    public operator fun component9(): ConstPtr = this.aMachinePolicyNames

    public operator fun component10(): UInt = this.cMachinePolicyNames

    public operator fun component11(): ConstPtr = this.aMachinePolicyPaths

    public operator fun component12(): UInt = this.cMachinePolicyPaths

    public operator fun component13(): Pwstr = this.lpNetbiosName

    public operator fun component14(): Pwstr = this.lpSiteName

    public operator fun component15(): Pwstr = this.lpPrimaryDNSDomain

    public fun copy(dwVersion: UInt = this.dwVersion, lpDomain: Pcwstr = this.lpDomain, lpHostName: Pcwstr = this.lpHostName, lpMachineAccountOU: Pcwstr = this.lpMachineAccountOU, lpDcName: Pcwstr = this.lpDcName, dwProvisionOptions: NetsetupProvision = this.dwProvisionOptions, aCertTemplateNames: ConstPtr = this.aCertTemplateNames, cCertTemplateNames: UInt = this.cCertTemplateNames, aMachinePolicyNames: ConstPtr = this.aMachinePolicyNames, cMachinePolicyNames: UInt = this.cMachinePolicyNames, aMachinePolicyPaths: ConstPtr = this.aMachinePolicyPaths, cMachinePolicyPaths: UInt = this.cMachinePolicyPaths, lpNetbiosName: Pwstr = this.lpNetbiosName, lpSiteName: Pwstr = this.lpSiteName, lpPrimaryDNSDomain: Pwstr = this.lpPrimaryDNSDomain): NetsetupProvisioningParams = NetsetupProvisioningParams(dwVersion = dwVersion, lpDomainCtorArg = lpDomain, lpHostNameCtorArg = lpHostName, lpMachineAccountOUCtorArg = lpMachineAccountOU, lpDcNameCtorArg = lpDcName, dwProvisionOptions = dwProvisionOptions, aCertTemplateNamesCtorArg = aCertTemplateNames, cCertTemplateNames = cCertTemplateNames, aMachinePolicyNamesCtorArg = aMachinePolicyNames, cMachinePolicyNames = cMachinePolicyNames, aMachinePolicyPathsCtorArg = aMachinePolicyPaths, cMachinePolicyPaths = cMachinePolicyPaths, lpNetbiosNameCtorArg = lpNetbiosName, lpSiteNameCtorArg = lpSiteName, lpPrimaryDNSDomainCtorArg = lpPrimaryDNSDomain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetsetupProvisioningParams) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDomain != other.lpDomain) return false
        if (this.lpHostName != other.lpHostName) return false
        if (this.lpMachineAccountOU != other.lpMachineAccountOU) return false
        if (this.lpDcName != other.lpDcName) return false
        if (this.dwProvisionOptions != other.dwProvisionOptions) return false
        if (this.aCertTemplateNames != other.aCertTemplateNames) return false
        if (this.cCertTemplateNames != other.cCertTemplateNames) return false
        if (this.aMachinePolicyNames != other.aMachinePolicyNames) return false
        if (this.cMachinePolicyNames != other.cMachinePolicyNames) return false
        if (this.aMachinePolicyPaths != other.aMachinePolicyPaths) return false
        if (this.cMachinePolicyPaths != other.cMachinePolicyPaths) return false
        if (this.lpNetbiosName != other.lpNetbiosName) return false
        if (this.lpSiteName != other.lpSiteName) return false
        if (this.lpPrimaryDNSDomain != other.lpPrimaryDNSDomain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.lpDomain.hashCode()
        result = 31 * result + this.lpHostName.hashCode()
        result = 31 * result + this.lpMachineAccountOU.hashCode()
        result = 31 * result + this.lpDcName.hashCode()
        result = 31 * result + this.dwProvisionOptions.hashCode()
        result = 31 * result + this.aCertTemplateNames.hashCode()
        result = 31 * result + this.cCertTemplateNames.hashCode()
        result = 31 * result + this.aMachinePolicyNames.hashCode()
        result = 31 * result + this.cMachinePolicyNames.hashCode()
        result = 31 * result + this.aMachinePolicyPaths.hashCode()
        result = 31 * result + this.cMachinePolicyPaths.hashCode()
        result = 31 * result + this.lpNetbiosName.hashCode()
        result = 31 * result + this.lpSiteName.hashCode()
        result = 31 * result + this.lpPrimaryDNSDomain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            lpDomain: Pcwstr = ConstPtr(0L),
            lpHostName: Pcwstr = ConstPtr(0L),
            lpMachineAccountOU: Pcwstr = ConstPtr(0L),
            lpDcName: Pcwstr = ConstPtr(0L),
            dwProvisionOptions: NetsetupProvision = 0u,
            aCertTemplateNames: ConstPtr = ConstPtr(0L),
            cCertTemplateNames: UInt = 0u,
            aMachinePolicyNames: ConstPtr = ConstPtr(0L),
            cMachinePolicyNames: UInt = 0u,
            aMachinePolicyPaths: ConstPtr = ConstPtr(0L),
            cMachinePolicyPaths: UInt = 0u,
            lpNetbiosName: Pwstr = MutPtr(0L),
            lpSiteName: Pwstr = MutPtr(0L),
            lpPrimaryDNSDomain: Pwstr = MutPtr(0L),
        ): NetsetupProvisioningParams =
            NetsetupProvisioningParams(
                dwVersion = dwVersion,
                lpDomainCtorArg = lpDomain,
                lpHostNameCtorArg = lpHostName,
                lpMachineAccountOUCtorArg = lpMachineAccountOU,
                lpDcNameCtorArg = lpDcName,
                dwProvisionOptions = dwProvisionOptions,
                aCertTemplateNamesCtorArg = aCertTemplateNames,
                cCertTemplateNames = cCertTemplateNames,
                aMachinePolicyNamesCtorArg = aMachinePolicyNames,
                cMachinePolicyNames = cMachinePolicyNames,
                aMachinePolicyPathsCtorArg = aMachinePolicyPaths,
                cMachinePolicyPaths = cMachinePolicyPaths,
                lpNetbiosNameCtorArg = lpNetbiosName,
                lpSiteNameCtorArg = lpSiteName,
                lpPrimaryDNSDomainCtorArg = lpPrimaryDNSDomain,
            )
    }
}

public data class NetworkName(
    public var name: FlatString = FlatString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): NetworkName =
                    NetworkName(
                        (FlatString.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NetworkName) {
                    (FlatString.typeLayout()).writeNative(addr, value.name)
                }
            }
    }
}

public class NetDisplayGroup internal constructor(
    grpi3NameCtorArg: Pwstr,
    grpi3CommentCtorArg: Pwstr,
    public var grpi3GroupId: UInt,
    public var grpi3Attributes: UInt,
    public var grpi3NextIndex: UInt,
) {
    public var grpi3Name: Pwstr = grpi3NameCtorArg
        internal set

    public var grpi3Comment: Pwstr = grpi3CommentCtorArg
        internal set

    public constructor() : this(
        grpi3NameCtorArg = MutPtr(0L),
        grpi3CommentCtorArg = MutPtr(0L),
        grpi3GroupId = 0u,
        grpi3Attributes = 0u,
        grpi3NextIndex = 0u,
    )

    public operator fun component1(): Pwstr = this.grpi3Name

    public operator fun component2(): Pwstr = this.grpi3Comment

    public operator fun component3(): UInt = this.grpi3GroupId

    public operator fun component4(): UInt = this.grpi3Attributes

    public operator fun component5(): UInt = this.grpi3NextIndex

    public fun copy(grpi3Name: Pwstr = this.grpi3Name, grpi3Comment: Pwstr = this.grpi3Comment, grpi3GroupId: UInt = this.grpi3GroupId, grpi3Attributes: UInt = this.grpi3Attributes, grpi3NextIndex: UInt = this.grpi3NextIndex): NetDisplayGroup = NetDisplayGroup(grpi3NameCtorArg = grpi3Name, grpi3CommentCtorArg = grpi3Comment, grpi3GroupId = grpi3GroupId, grpi3Attributes = grpi3Attributes, grpi3NextIndex = grpi3NextIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetDisplayGroup) return false
        if (this.grpi3Name != other.grpi3Name) return false
        if (this.grpi3Comment != other.grpi3Comment) return false
        if (this.grpi3GroupId != other.grpi3GroupId) return false
        if (this.grpi3Attributes != other.grpi3Attributes) return false
        if (this.grpi3NextIndex != other.grpi3NextIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grpi3Name.hashCode()
        result = 31 * result + this.grpi3Comment.hashCode()
        result = 31 * result + this.grpi3GroupId.hashCode()
        result = 31 * result + this.grpi3Attributes.hashCode()
        result = 31 * result + this.grpi3NextIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            grpi3Name: Pwstr = MutPtr(0L),
            grpi3Comment: Pwstr = MutPtr(0L),
            grpi3GroupId: UInt = 0u,
            grpi3Attributes: UInt = 0u,
            grpi3NextIndex: UInt = 0u,
        ): NetDisplayGroup =
            NetDisplayGroup(
                grpi3NameCtorArg = grpi3Name,
                grpi3CommentCtorArg = grpi3Comment,
                grpi3GroupId = grpi3GroupId,
                grpi3Attributes = grpi3Attributes,
                grpi3NextIndex = grpi3NextIndex,
            )
    }
}

public class NetDisplayMachine internal constructor(
    usri2NameCtorArg: Pwstr,
    usri2CommentCtorArg: Pwstr,
    public var usri2Flags: UserAccountFlags,
    public var usri2UserId: UInt,
    public var usri2NextIndex: UInt,
) {
    public var usri2Name: Pwstr = usri2NameCtorArg
        internal set

    public var usri2Comment: Pwstr = usri2CommentCtorArg
        internal set

    public constructor() : this(
        usri2NameCtorArg = MutPtr(0L),
        usri2CommentCtorArg = MutPtr(0L),
        usri2Flags = 0u,
        usri2UserId = 0u,
        usri2NextIndex = 0u,
    )

    public operator fun component1(): Pwstr = this.usri2Name

    public operator fun component2(): Pwstr = this.usri2Comment

    public operator fun component3(): UserAccountFlags = this.usri2Flags

    public operator fun component4(): UInt = this.usri2UserId

    public operator fun component5(): UInt = this.usri2NextIndex

    public fun copy(usri2Name: Pwstr = this.usri2Name, usri2Comment: Pwstr = this.usri2Comment, usri2Flags: UserAccountFlags = this.usri2Flags, usri2UserId: UInt = this.usri2UserId, usri2NextIndex: UInt = this.usri2NextIndex): NetDisplayMachine = NetDisplayMachine(usri2NameCtorArg = usri2Name, usri2CommentCtorArg = usri2Comment, usri2Flags = usri2Flags, usri2UserId = usri2UserId, usri2NextIndex = usri2NextIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetDisplayMachine) return false
        if (this.usri2Name != other.usri2Name) return false
        if (this.usri2Comment != other.usri2Comment) return false
        if (this.usri2Flags != other.usri2Flags) return false
        if (this.usri2UserId != other.usri2UserId) return false
        if (this.usri2NextIndex != other.usri2NextIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri2Name.hashCode()
        result = 31 * result + this.usri2Comment.hashCode()
        result = 31 * result + this.usri2Flags.hashCode()
        result = 31 * result + this.usri2UserId.hashCode()
        result = 31 * result + this.usri2NextIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri2Name: Pwstr = MutPtr(0L),
            usri2Comment: Pwstr = MutPtr(0L),
            usri2Flags: UserAccountFlags = 0u,
            usri2UserId: UInt = 0u,
            usri2NextIndex: UInt = 0u,
        ): NetDisplayMachine =
            NetDisplayMachine(
                usri2NameCtorArg = usri2Name,
                usri2CommentCtorArg = usri2Comment,
                usri2Flags = usri2Flags,
                usri2UserId = usri2UserId,
                usri2NextIndex = usri2NextIndex,
            )
    }
}

public class NetDisplayUser internal constructor(
    usri1NameCtorArg: Pwstr,
    usri1CommentCtorArg: Pwstr,
    public var usri1Flags: UserAccountFlags,
    usri1FullNameCtorArg: Pwstr,
    public var usri1UserId: UInt,
    public var usri1NextIndex: UInt,
) {
    public var usri1Name: Pwstr = usri1NameCtorArg
        internal set

    public var usri1Comment: Pwstr = usri1CommentCtorArg
        internal set

    public var usri1FullName: Pwstr = usri1FullNameCtorArg
        internal set

    public constructor() : this(
        usri1NameCtorArg = MutPtr(0L),
        usri1CommentCtorArg = MutPtr(0L),
        usri1Flags = 0u,
        usri1FullNameCtorArg = MutPtr(0L),
        usri1UserId = 0u,
        usri1NextIndex = 0u,
    )

    public operator fun component1(): Pwstr = this.usri1Name

    public operator fun component2(): Pwstr = this.usri1Comment

    public operator fun component3(): UserAccountFlags = this.usri1Flags

    public operator fun component4(): Pwstr = this.usri1FullName

    public operator fun component5(): UInt = this.usri1UserId

    public operator fun component6(): UInt = this.usri1NextIndex

    public fun copy(usri1Name: Pwstr = this.usri1Name, usri1Comment: Pwstr = this.usri1Comment, usri1Flags: UserAccountFlags = this.usri1Flags, usri1FullName: Pwstr = this.usri1FullName, usri1UserId: UInt = this.usri1UserId, usri1NextIndex: UInt = this.usri1NextIndex): NetDisplayUser = NetDisplayUser(usri1NameCtorArg = usri1Name, usri1CommentCtorArg = usri1Comment, usri1Flags = usri1Flags, usri1FullNameCtorArg = usri1FullName, usri1UserId = usri1UserId, usri1NextIndex = usri1NextIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetDisplayUser) return false
        if (this.usri1Name != other.usri1Name) return false
        if (this.usri1Comment != other.usri1Comment) return false
        if (this.usri1Flags != other.usri1Flags) return false
        if (this.usri1FullName != other.usri1FullName) return false
        if (this.usri1UserId != other.usri1UserId) return false
        if (this.usri1NextIndex != other.usri1NextIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri1Name.hashCode()
        result = 31 * result + this.usri1Comment.hashCode()
        result = 31 * result + this.usri1Flags.hashCode()
        result = 31 * result + this.usri1FullName.hashCode()
        result = 31 * result + this.usri1UserId.hashCode()
        result = 31 * result + this.usri1NextIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri1Name: Pwstr = MutPtr(0L),
            usri1Comment: Pwstr = MutPtr(0L),
            usri1Flags: UserAccountFlags = 0u,
            usri1FullName: Pwstr = MutPtr(0L),
            usri1UserId: UInt = 0u,
            usri1NextIndex: UInt = 0u,
        ): NetDisplayUser =
            NetDisplayUser(
                usri1NameCtorArg = usri1Name,
                usri1CommentCtorArg = usri1Comment,
                usri1Flags = usri1Flags,
                usri1FullNameCtorArg = usri1FullName,
                usri1UserId = usri1UserId,
                usri1NextIndex = usri1NextIndex,
            )
    }
}

public data class NetValidateAuthenticationInputArg(
    public var inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var passwordMatched: Boolean = false,
)

public data class NetValidateOutputArg(
    public var changedPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var validationStatus: UInt = 0u,
)

public class NetValidatePasswordChangeInputArg internal constructor(
    public var inputPersistedFields: NetValidatePersistedFields,
    clearPasswordCtorArg: Pwstr,
    userAccountNameCtorArg: Pwstr,
    public var hashedPassword: NetValidatePasswordHash,
    public var passwordMatch: Boolean,
) {
    public var clearPassword: Pwstr = clearPasswordCtorArg
        internal set

    public var userAccountName: Pwstr = userAccountNameCtorArg
        internal set

    public constructor() : this(
        inputPersistedFields = NetValidatePersistedFields(),
        clearPasswordCtorArg = MutPtr(0L),
        userAccountNameCtorArg = MutPtr(0L),
        hashedPassword = NetValidatePasswordHash(),
        passwordMatch = false,
    )

    public operator fun component1(): NetValidatePersistedFields = this.inputPersistedFields

    public operator fun component2(): Pwstr = this.clearPassword

    public operator fun component3(): Pwstr = this.userAccountName

    public operator fun component4(): NetValidatePasswordHash = this.hashedPassword

    public operator fun component5(): Boolean = this.passwordMatch

    public fun copy(inputPersistedFields: NetValidatePersistedFields = this.inputPersistedFields, clearPassword: Pwstr = this.clearPassword, userAccountName: Pwstr = this.userAccountName, hashedPassword: NetValidatePasswordHash = this.hashedPassword, passwordMatch: Boolean = this.passwordMatch): NetValidatePasswordChangeInputArg = NetValidatePasswordChangeInputArg(inputPersistedFields = inputPersistedFields, clearPasswordCtorArg = clearPassword, userAccountNameCtorArg = userAccountName, hashedPassword = hashedPassword, passwordMatch = passwordMatch)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetValidatePasswordChangeInputArg) return false
        if (this.inputPersistedFields != other.inputPersistedFields) return false
        if (this.clearPassword != other.clearPassword) return false
        if (this.userAccountName != other.userAccountName) return false
        if (this.hashedPassword != other.hashedPassword) return false
        if (this.passwordMatch != other.passwordMatch) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inputPersistedFields.hashCode()
        result = 31 * result + this.clearPassword.hashCode()
        result = 31 * result + this.userAccountName.hashCode()
        result = 31 * result + this.hashedPassword.hashCode()
        result = 31 * result + this.passwordMatch.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
            clearPassword: Pwstr = MutPtr(0L),
            userAccountName: Pwstr = MutPtr(0L),
            hashedPassword: NetValidatePasswordHash = NetValidatePasswordHash(),
            passwordMatch: Boolean = false,
        ): NetValidatePasswordChangeInputArg =
            NetValidatePasswordChangeInputArg(
                inputPersistedFields = inputPersistedFields,
                clearPasswordCtorArg = clearPassword,
                userAccountNameCtorArg = userAccountName,
                hashedPassword = hashedPassword,
                passwordMatch = passwordMatch,
            )
    }
}

public class NetValidatePasswordHash internal constructor(
    public var length: UInt,
    hashCtorArg: MutPtr,
) {
    public var hash: MutPtr = hashCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        hashCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr = this.hash

    public fun copy(length: UInt = this.length, hash: MutPtr = this.hash): NetValidatePasswordHash = NetValidatePasswordHash(length = length, hashCtorArg = hash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetValidatePasswordHash) return false
        if (this.length != other.length) return false
        if (this.hash != other.hash) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.hash.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetValidatePasswordHash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetValidatePasswordHash> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NetValidatePasswordHash =
                    NetValidatePasswordHash(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetValidatePasswordHash) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.hash)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            hash: MutPtr = MutPtr(0L),
        ): NetValidatePasswordHash =
            NetValidatePasswordHash(
                length = length,
                hashCtorArg = hash,
            )
    }
}

public class NetValidatePasswordResetInputArg internal constructor(
    public var inputPersistedFields: NetValidatePersistedFields,
    clearPasswordCtorArg: Pwstr,
    userAccountNameCtorArg: Pwstr,
    public var hashedPassword: NetValidatePasswordHash,
    public var passwordMustChangeAtNextLogon: Boolean,
    public var clearLockout: Boolean,
) {
    public var clearPassword: Pwstr = clearPasswordCtorArg
        internal set

    public var userAccountName: Pwstr = userAccountNameCtorArg
        internal set

    public constructor() : this(
        inputPersistedFields = NetValidatePersistedFields(),
        clearPasswordCtorArg = MutPtr(0L),
        userAccountNameCtorArg = MutPtr(0L),
        hashedPassword = NetValidatePasswordHash(),
        passwordMustChangeAtNextLogon = false,
        clearLockout = false,
    )

    public operator fun component1(): NetValidatePersistedFields = this.inputPersistedFields

    public operator fun component2(): Pwstr = this.clearPassword

    public operator fun component3(): Pwstr = this.userAccountName

    public operator fun component4(): NetValidatePasswordHash = this.hashedPassword

    public operator fun component5(): Boolean = this.passwordMustChangeAtNextLogon

    public operator fun component6(): Boolean = this.clearLockout

    public fun copy(inputPersistedFields: NetValidatePersistedFields = this.inputPersistedFields, clearPassword: Pwstr = this.clearPassword, userAccountName: Pwstr = this.userAccountName, hashedPassword: NetValidatePasswordHash = this.hashedPassword, passwordMustChangeAtNextLogon: Boolean = this.passwordMustChangeAtNextLogon, clearLockout: Boolean = this.clearLockout): NetValidatePasswordResetInputArg = NetValidatePasswordResetInputArg(inputPersistedFields = inputPersistedFields, clearPasswordCtorArg = clearPassword, userAccountNameCtorArg = userAccountName, hashedPassword = hashedPassword, passwordMustChangeAtNextLogon = passwordMustChangeAtNextLogon, clearLockout = clearLockout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetValidatePasswordResetInputArg) return false
        if (this.inputPersistedFields != other.inputPersistedFields) return false
        if (this.clearPassword != other.clearPassword) return false
        if (this.userAccountName != other.userAccountName) return false
        if (this.hashedPassword != other.hashedPassword) return false
        if (this.passwordMustChangeAtNextLogon != other.passwordMustChangeAtNextLogon) return false
        if (this.clearLockout != other.clearLockout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inputPersistedFields.hashCode()
        result = 31 * result + this.clearPassword.hashCode()
        result = 31 * result + this.userAccountName.hashCode()
        result = 31 * result + this.hashedPassword.hashCode()
        result = 31 * result + this.passwordMustChangeAtNextLogon.hashCode()
        result = 31 * result + this.clearLockout.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
            clearPassword: Pwstr = MutPtr(0L),
            userAccountName: Pwstr = MutPtr(0L),
            hashedPassword: NetValidatePasswordHash = NetValidatePasswordHash(),
            passwordMustChangeAtNextLogon: Boolean = false,
            clearLockout: Boolean = false,
        ): NetValidatePasswordResetInputArg =
            NetValidatePasswordResetInputArg(
                inputPersistedFields = inputPersistedFields,
                clearPasswordCtorArg = clearPassword,
                userAccountNameCtorArg = userAccountName,
                hashedPassword = hashedPassword,
                passwordMustChangeAtNextLogon = passwordMustChangeAtNextLogon,
                clearLockout = clearLockout,
            )
    }
}

public class NetValidatePersistedFields internal constructor(
    public var presentFields: UInt,
    public var passwordLastSet: Filetime,
    public var badPasswordTime: Filetime,
    public var lockoutTime: Filetime,
    public var badPasswordCount: UInt,
    public var passwordHistoryLength: UInt,
    passwordHistoryCtorArg: MutPtr,
) {
    public var passwordHistory: MutPtr = passwordHistoryCtorArg
        internal set

    public constructor() : this(
        presentFields = 0u,
        passwordLastSet = Filetime(),
        badPasswordTime = Filetime(),
        lockoutTime = Filetime(),
        badPasswordCount = 0u,
        passwordHistoryLength = 0u,
        passwordHistoryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.presentFields

    public operator fun component2(): Filetime = this.passwordLastSet

    public operator fun component3(): Filetime = this.badPasswordTime

    public operator fun component4(): Filetime = this.lockoutTime

    public operator fun component5(): UInt = this.badPasswordCount

    public operator fun component6(): UInt = this.passwordHistoryLength

    public operator fun component7(): MutPtr = this.passwordHistory

    public fun copy(presentFields: UInt = this.presentFields, passwordLastSet: Filetime = this.passwordLastSet, badPasswordTime: Filetime = this.badPasswordTime, lockoutTime: Filetime = this.lockoutTime, badPasswordCount: UInt = this.badPasswordCount, passwordHistoryLength: UInt = this.passwordHistoryLength, passwordHistory: MutPtr = this.passwordHistory): NetValidatePersistedFields = NetValidatePersistedFields(presentFields = presentFields, passwordLastSet = passwordLastSet, badPasswordTime = badPasswordTime, lockoutTime = lockoutTime, badPasswordCount = badPasswordCount, passwordHistoryLength = passwordHistoryLength, passwordHistoryCtorArg = passwordHistory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetValidatePersistedFields) return false
        if (this.presentFields != other.presentFields) return false
        if (this.passwordLastSet != other.passwordLastSet) return false
        if (this.badPasswordTime != other.badPasswordTime) return false
        if (this.lockoutTime != other.lockoutTime) return false
        if (this.badPasswordCount != other.badPasswordCount) return false
        if (this.passwordHistoryLength != other.passwordHistoryLength) return false
        if (this.passwordHistory != other.passwordHistory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.presentFields.hashCode()
        result = 31 * result + this.passwordLastSet.hashCode()
        result = 31 * result + this.badPasswordTime.hashCode()
        result = 31 * result + this.lockoutTime.hashCode()
        result = 31 * result + this.badPasswordCount.hashCode()
        result = 31 * result + this.passwordHistoryLength.hashCode()
        result = 31 * result + this.passwordHistory.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            presentFields: UInt = 0u,
            passwordLastSet: Filetime = Filetime(),
            badPasswordTime: Filetime = Filetime(),
            lockoutTime: Filetime = Filetime(),
            badPasswordCount: UInt = 0u,
            passwordHistoryLength: UInt = 0u,
            passwordHistory: MutPtr = MutPtr(0L),
        ): NetValidatePersistedFields =
            NetValidatePersistedFields(
                presentFields = presentFields,
                passwordLastSet = passwordLastSet,
                badPasswordTime = badPasswordTime,
                lockoutTime = lockoutTime,
                badPasswordCount = badPasswordCount,
                passwordHistoryLength = passwordHistoryLength,
                passwordHistoryCtorArg = passwordHistory,
            )
    }
}

public class OboToken internal constructor(
    public var type: OboTokenType,
    pnccCtorArg: MutPtr,
    pszwManufacturerCtorArg: Pcwstr,
    pszwProductCtorArg: Pcwstr,
    pszwDisplayNameCtorArg: Pcwstr,
    public var fRegistered: Bool,
) {
    public var pncc: MutPtr = pnccCtorArg
        internal set

    public var pszwManufacturer: Pcwstr = pszwManufacturerCtorArg
        internal set

    public var pszwProduct: Pcwstr = pszwProductCtorArg
        internal set

    public var pszwDisplayName: Pcwstr = pszwDisplayNameCtorArg
        internal set

    public constructor() : this(
        type = 0,
        pnccCtorArg = MutPtr(0L),
        pszwManufacturerCtorArg = ConstPtr(0L),
        pszwProductCtorArg = ConstPtr(0L),
        pszwDisplayNameCtorArg = ConstPtr(0L),
        fRegistered = 0,
    )

    public operator fun component1(): OboTokenType = this.type

    public operator fun component2(): MutPtr = this.pncc

    public operator fun component3(): Pcwstr = this.pszwManufacturer

    public operator fun component4(): Pcwstr = this.pszwProduct

    public operator fun component5(): Pcwstr = this.pszwDisplayName

    public operator fun component6(): Bool = this.fRegistered

    public fun copy(type: OboTokenType = this.type, pncc: MutPtr = this.pncc, pszwManufacturer: Pcwstr = this.pszwManufacturer, pszwProduct: Pcwstr = this.pszwProduct, pszwDisplayName: Pcwstr = this.pszwDisplayName, fRegistered: Bool = this.fRegistered): OboToken = OboToken(type = type, pnccCtorArg = pncc, pszwManufacturerCtorArg = pszwManufacturer, pszwProductCtorArg = pszwProduct, pszwDisplayNameCtorArg = pszwDisplayName, fRegistered = fRegistered)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OboToken) return false
        if (this.type != other.type) return false
        if (this.pncc != other.pncc) return false
        if (this.pszwManufacturer != other.pszwManufacturer) return false
        if (this.pszwProduct != other.pszwProduct) return false
        if (this.pszwDisplayName != other.pszwDisplayName) return false
        if (this.fRegistered != other.fRegistered) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.pncc.hashCode()
        result = 31 * result + this.pszwManufacturer.hashCode()
        result = 31 * result + this.pszwProduct.hashCode()
        result = 31 * result + this.pszwDisplayName.hashCode()
        result = 31 * result + this.fRegistered.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: OboTokenType = 0,
            pncc: MutPtr = MutPtr(0L),
            pszwManufacturer: Pcwstr = ConstPtr(0L),
            pszwProduct: Pcwstr = ConstPtr(0L),
            pszwDisplayName: Pcwstr = ConstPtr(0L),
            fRegistered: Bool = 0,
        ): OboToken =
            OboToken(
                type = type,
                pnccCtorArg = pncc,
                pszwManufacturerCtorArg = pszwManufacturer,
                pszwProductCtorArg = pszwProduct,
                pszwDisplayNameCtorArg = pszwDisplayName,
                fRegistered = fRegistered,
            )
    }
}

public data class PrintOtherInfo(
    public var alrtprJobid: UInt = 0u,
    public var alrtprStatus: UInt = 0u,
    public var alrtprSubmitted: UInt = 0u,
    public var alrtprSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintOtherInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintOtherInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PrintOtherInfo =
                    PrintOtherInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PrintOtherInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alrtprJobid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alrtprStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.alrtprSubmitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.alrtprSize)
                }
            }
    }
}

public data class RasconIpui(
    public var guidConnection: Guid = Guid(),
    public var fIPv6Cfg: Bool = 0,
    public var dwFlags: UInt = 0u,
    public var pszwIpAddr: UShortArray = UShortArray(16),
    public var pszwDnsAddr: UShortArray = UShortArray(16),
    public var pszwDns2Addr: UShortArray = UShortArray(16),
    public var pszwWinsAddr: UShortArray = UShortArray(16),
    public var pszwWins2Addr: UShortArray = UShortArray(16),
    public var pszwDnsSuffix: UShortArray = UShortArray(256),
    public var pszwIpv6Addr: UShortArray = UShortArray(65),
    public var dwIpv6PrefixLength: UInt = 0u,
    public var pszwIpv6DnsAddr: UShortArray = UShortArray(65),
    public var pszwIpv6Dns2Addr: UShortArray = UShortArray(65),
    public var dwIPv4InfMetric: UInt = 0u,
    public var dwIPv6InfMetric: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasconIpui) return false
        if (this.guidConnection != other.guidConnection) return false
        if (this.fIPv6Cfg != other.fIPv6Cfg) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.pszwIpAddr.contentEquals(other.pszwIpAddr)) return false
        if (!this.pszwDnsAddr.contentEquals(other.pszwDnsAddr)) return false
        if (!this.pszwDns2Addr.contentEquals(other.pszwDns2Addr)) return false
        if (!this.pszwWinsAddr.contentEquals(other.pszwWinsAddr)) return false
        if (!this.pszwWins2Addr.contentEquals(other.pszwWins2Addr)) return false
        if (!this.pszwDnsSuffix.contentEquals(other.pszwDnsSuffix)) return false
        if (!this.pszwIpv6Addr.contentEquals(other.pszwIpv6Addr)) return false
        if (this.dwIpv6PrefixLength != other.dwIpv6PrefixLength) return false
        if (!this.pszwIpv6DnsAddr.contentEquals(other.pszwIpv6DnsAddr)) return false
        if (!this.pszwIpv6Dns2Addr.contentEquals(other.pszwIpv6Dns2Addr)) return false
        if (this.dwIPv4InfMetric != other.dwIPv4InfMetric) return false
        if (this.dwIPv6InfMetric != other.dwIPv6InfMetric) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidConnection.hashCode()
        result = 31 * result + this.fIPv6Cfg.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszwIpAddr.contentHashCode()
        result = 31 * result + this.pszwDnsAddr.contentHashCode()
        result = 31 * result + this.pszwDns2Addr.contentHashCode()
        result = 31 * result + this.pszwWinsAddr.contentHashCode()
        result = 31 * result + this.pszwWins2Addr.contentHashCode()
        result = 31 * result + this.pszwDnsSuffix.contentHashCode()
        result = 31 * result + this.pszwIpv6Addr.contentHashCode()
        result = 31 * result + this.dwIpv6PrefixLength.hashCode()
        result = 31 * result + this.pszwIpv6DnsAddr.contentHashCode()
        result = 31 * result + this.pszwIpv6Dns2Addr.contentHashCode()
        result = 31 * result + this.dwIPv4InfMetric.hashCode()
        result = 31 * result + this.dwIPv6InfMetric.hashCode()
        return result
    }
}

public class ReplEdirInfo0 internal constructor(
    rped0DirnameCtorArg: Pwstr,
) {
    public var rped0Dirname: Pwstr = rped0DirnameCtorArg
        internal set

    public constructor() : this(
        rped0DirnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.rped0Dirname

    public fun copy(rped0Dirname: Pwstr = this.rped0Dirname): ReplEdirInfo0 = ReplEdirInfo0(rped0DirnameCtorArg = rped0Dirname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplEdirInfo0) return false
        if (this.rped0Dirname != other.rped0Dirname) return false
        return true
    }

    override fun hashCode(): Int = this.rped0Dirname.hashCode()

    public companion object {
        public operator fun invoke(
            rped0Dirname: Pwstr = MutPtr(0L),
        ): ReplEdirInfo0 =
            ReplEdirInfo0(
                rped0DirnameCtorArg = rped0Dirname,
            )
    }
}

public class ReplEdirInfo1 internal constructor(
    rped1DirnameCtorArg: Pwstr,
    public var rped1Integrity: UInt,
    public var rped1Extent: UInt,
) {
    public var rped1Dirname: Pwstr = rped1DirnameCtorArg
        internal set

    public constructor() : this(
        rped1DirnameCtorArg = MutPtr(0L),
        rped1Integrity = 0u,
        rped1Extent = 0u,
    )

    public operator fun component1(): Pwstr = this.rped1Dirname

    public operator fun component2(): UInt = this.rped1Integrity

    public operator fun component3(): UInt = this.rped1Extent

    public fun copy(rped1Dirname: Pwstr = this.rped1Dirname, rped1Integrity: UInt = this.rped1Integrity, rped1Extent: UInt = this.rped1Extent): ReplEdirInfo1 = ReplEdirInfo1(rped1DirnameCtorArg = rped1Dirname, rped1Integrity = rped1Integrity, rped1Extent = rped1Extent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplEdirInfo1) return false
        if (this.rped1Dirname != other.rped1Dirname) return false
        if (this.rped1Integrity != other.rped1Integrity) return false
        if (this.rped1Extent != other.rped1Extent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rped1Dirname.hashCode()
        result = 31 * result + this.rped1Integrity.hashCode()
        result = 31 * result + this.rped1Extent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rped1Dirname: Pwstr = MutPtr(0L),
            rped1Integrity: UInt = 0u,
            rped1Extent: UInt = 0u,
        ): ReplEdirInfo1 =
            ReplEdirInfo1(
                rped1DirnameCtorArg = rped1Dirname,
                rped1Integrity = rped1Integrity,
                rped1Extent = rped1Extent,
            )
    }
}

public data class ReplEdirInfo1000(
    public var rped1000Integrity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplEdirInfo1000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplEdirInfo1000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplEdirInfo1000 =
                    ReplEdirInfo1000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplEdirInfo1000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rped1000Integrity)
                }
            }
    }
}

public data class ReplEdirInfo1001(
    public var rped1001Extent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplEdirInfo1001> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplEdirInfo1001> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplEdirInfo1001 =
                    ReplEdirInfo1001(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplEdirInfo1001) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rped1001Extent)
                }
            }
    }
}

public class ReplEdirInfo2 internal constructor(
    rped2DirnameCtorArg: Pwstr,
    public var rped2Integrity: UInt,
    public var rped2Extent: UInt,
    public var rped2Lockcount: UInt,
    public var rped2Locktime: UInt,
) {
    public var rped2Dirname: Pwstr = rped2DirnameCtorArg
        internal set

    public constructor() : this(
        rped2DirnameCtorArg = MutPtr(0L),
        rped2Integrity = 0u,
        rped2Extent = 0u,
        rped2Lockcount = 0u,
        rped2Locktime = 0u,
    )

    public operator fun component1(): Pwstr = this.rped2Dirname

    public operator fun component2(): UInt = this.rped2Integrity

    public operator fun component3(): UInt = this.rped2Extent

    public operator fun component4(): UInt = this.rped2Lockcount

    public operator fun component5(): UInt = this.rped2Locktime

    public fun copy(rped2Dirname: Pwstr = this.rped2Dirname, rped2Integrity: UInt = this.rped2Integrity, rped2Extent: UInt = this.rped2Extent, rped2Lockcount: UInt = this.rped2Lockcount, rped2Locktime: UInt = this.rped2Locktime): ReplEdirInfo2 = ReplEdirInfo2(rped2DirnameCtorArg = rped2Dirname, rped2Integrity = rped2Integrity, rped2Extent = rped2Extent, rped2Lockcount = rped2Lockcount, rped2Locktime = rped2Locktime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplEdirInfo2) return false
        if (this.rped2Dirname != other.rped2Dirname) return false
        if (this.rped2Integrity != other.rped2Integrity) return false
        if (this.rped2Extent != other.rped2Extent) return false
        if (this.rped2Lockcount != other.rped2Lockcount) return false
        if (this.rped2Locktime != other.rped2Locktime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rped2Dirname.hashCode()
        result = 31 * result + this.rped2Integrity.hashCode()
        result = 31 * result + this.rped2Extent.hashCode()
        result = 31 * result + this.rped2Lockcount.hashCode()
        result = 31 * result + this.rped2Locktime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rped2Dirname: Pwstr = MutPtr(0L),
            rped2Integrity: UInt = 0u,
            rped2Extent: UInt = 0u,
            rped2Lockcount: UInt = 0u,
            rped2Locktime: UInt = 0u,
        ): ReplEdirInfo2 =
            ReplEdirInfo2(
                rped2DirnameCtorArg = rped2Dirname,
                rped2Integrity = rped2Integrity,
                rped2Extent = rped2Extent,
                rped2Lockcount = rped2Lockcount,
                rped2Locktime = rped2Locktime,
            )
    }
}

public class ReplIdirInfo0 internal constructor(
    rpid0DirnameCtorArg: Pwstr,
) {
    public var rpid0Dirname: Pwstr = rpid0DirnameCtorArg
        internal set

    public constructor() : this(
        rpid0DirnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.rpid0Dirname

    public fun copy(rpid0Dirname: Pwstr = this.rpid0Dirname): ReplIdirInfo0 = ReplIdirInfo0(rpid0DirnameCtorArg = rpid0Dirname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplIdirInfo0) return false
        if (this.rpid0Dirname != other.rpid0Dirname) return false
        return true
    }

    override fun hashCode(): Int = this.rpid0Dirname.hashCode()

    public companion object {
        public operator fun invoke(
            rpid0Dirname: Pwstr = MutPtr(0L),
        ): ReplIdirInfo0 =
            ReplIdirInfo0(
                rpid0DirnameCtorArg = rpid0Dirname,
            )
    }
}

public class ReplIdirInfo1 internal constructor(
    rpid1DirnameCtorArg: Pwstr,
    public var rpid1State: UInt,
    rpid1MasternameCtorArg: Pwstr,
    public var rpid1LastUpdateTime: UInt,
    public var rpid1Lockcount: UInt,
    public var rpid1Locktime: UInt,
) {
    public var rpid1Dirname: Pwstr = rpid1DirnameCtorArg
        internal set

    public var rpid1Mastername: Pwstr = rpid1MasternameCtorArg
        internal set

    public constructor() : this(
        rpid1DirnameCtorArg = MutPtr(0L),
        rpid1State = 0u,
        rpid1MasternameCtorArg = MutPtr(0L),
        rpid1LastUpdateTime = 0u,
        rpid1Lockcount = 0u,
        rpid1Locktime = 0u,
    )

    public operator fun component1(): Pwstr = this.rpid1Dirname

    public operator fun component2(): UInt = this.rpid1State

    public operator fun component3(): Pwstr = this.rpid1Mastername

    public operator fun component4(): UInt = this.rpid1LastUpdateTime

    public operator fun component5(): UInt = this.rpid1Lockcount

    public operator fun component6(): UInt = this.rpid1Locktime

    public fun copy(rpid1Dirname: Pwstr = this.rpid1Dirname, rpid1State: UInt = this.rpid1State, rpid1Mastername: Pwstr = this.rpid1Mastername, rpid1LastUpdateTime: UInt = this.rpid1LastUpdateTime, rpid1Lockcount: UInt = this.rpid1Lockcount, rpid1Locktime: UInt = this.rpid1Locktime): ReplIdirInfo1 = ReplIdirInfo1(rpid1DirnameCtorArg = rpid1Dirname, rpid1State = rpid1State, rpid1MasternameCtorArg = rpid1Mastername, rpid1LastUpdateTime = rpid1LastUpdateTime, rpid1Lockcount = rpid1Lockcount, rpid1Locktime = rpid1Locktime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplIdirInfo1) return false
        if (this.rpid1Dirname != other.rpid1Dirname) return false
        if (this.rpid1State != other.rpid1State) return false
        if (this.rpid1Mastername != other.rpid1Mastername) return false
        if (this.rpid1LastUpdateTime != other.rpid1LastUpdateTime) return false
        if (this.rpid1Lockcount != other.rpid1Lockcount) return false
        if (this.rpid1Locktime != other.rpid1Locktime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rpid1Dirname.hashCode()
        result = 31 * result + this.rpid1State.hashCode()
        result = 31 * result + this.rpid1Mastername.hashCode()
        result = 31 * result + this.rpid1LastUpdateTime.hashCode()
        result = 31 * result + this.rpid1Lockcount.hashCode()
        result = 31 * result + this.rpid1Locktime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rpid1Dirname: Pwstr = MutPtr(0L),
            rpid1State: UInt = 0u,
            rpid1Mastername: Pwstr = MutPtr(0L),
            rpid1LastUpdateTime: UInt = 0u,
            rpid1Lockcount: UInt = 0u,
            rpid1Locktime: UInt = 0u,
        ): ReplIdirInfo1 =
            ReplIdirInfo1(
                rpid1DirnameCtorArg = rpid1Dirname,
                rpid1State = rpid1State,
                rpid1MasternameCtorArg = rpid1Mastername,
                rpid1LastUpdateTime = rpid1LastUpdateTime,
                rpid1Lockcount = rpid1Lockcount,
                rpid1Locktime = rpid1Locktime,
            )
    }
}

public class ReplInfo0 internal constructor(
    public var rp0Role: UInt,
    rp0ExportpathCtorArg: Pwstr,
    rp0ExportlistCtorArg: Pwstr,
    rp0ImportpathCtorArg: Pwstr,
    rp0ImportlistCtorArg: Pwstr,
    rp0LogonusernameCtorArg: Pwstr,
    public var rp0Interval: UInt,
    public var rp0Pulse: UInt,
    public var rp0Guardtime: UInt,
    public var rp0Random: UInt,
) {
    public var rp0Exportpath: Pwstr = rp0ExportpathCtorArg
        internal set

    public var rp0Exportlist: Pwstr = rp0ExportlistCtorArg
        internal set

    public var rp0Importpath: Pwstr = rp0ImportpathCtorArg
        internal set

    public var rp0Importlist: Pwstr = rp0ImportlistCtorArg
        internal set

    public var rp0Logonusername: Pwstr = rp0LogonusernameCtorArg
        internal set

    public constructor() : this(
        rp0Role = 0u,
        rp0ExportpathCtorArg = MutPtr(0L),
        rp0ExportlistCtorArg = MutPtr(0L),
        rp0ImportpathCtorArg = MutPtr(0L),
        rp0ImportlistCtorArg = MutPtr(0L),
        rp0LogonusernameCtorArg = MutPtr(0L),
        rp0Interval = 0u,
        rp0Pulse = 0u,
        rp0Guardtime = 0u,
        rp0Random = 0u,
    )

    public operator fun component1(): UInt = this.rp0Role

    public operator fun component2(): Pwstr = this.rp0Exportpath

    public operator fun component3(): Pwstr = this.rp0Exportlist

    public operator fun component4(): Pwstr = this.rp0Importpath

    public operator fun component5(): Pwstr = this.rp0Importlist

    public operator fun component6(): Pwstr = this.rp0Logonusername

    public operator fun component7(): UInt = this.rp0Interval

    public operator fun component8(): UInt = this.rp0Pulse

    public operator fun component9(): UInt = this.rp0Guardtime

    public operator fun component10(): UInt = this.rp0Random

    public fun copy(rp0Role: UInt = this.rp0Role, rp0Exportpath: Pwstr = this.rp0Exportpath, rp0Exportlist: Pwstr = this.rp0Exportlist, rp0Importpath: Pwstr = this.rp0Importpath, rp0Importlist: Pwstr = this.rp0Importlist, rp0Logonusername: Pwstr = this.rp0Logonusername, rp0Interval: UInt = this.rp0Interval, rp0Pulse: UInt = this.rp0Pulse, rp0Guardtime: UInt = this.rp0Guardtime, rp0Random: UInt = this.rp0Random): ReplInfo0 = ReplInfo0(rp0Role = rp0Role, rp0ExportpathCtorArg = rp0Exportpath, rp0ExportlistCtorArg = rp0Exportlist, rp0ImportpathCtorArg = rp0Importpath, rp0ImportlistCtorArg = rp0Importlist, rp0LogonusernameCtorArg = rp0Logonusername, rp0Interval = rp0Interval, rp0Pulse = rp0Pulse, rp0Guardtime = rp0Guardtime, rp0Random = rp0Random)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReplInfo0) return false
        if (this.rp0Role != other.rp0Role) return false
        if (this.rp0Exportpath != other.rp0Exportpath) return false
        if (this.rp0Exportlist != other.rp0Exportlist) return false
        if (this.rp0Importpath != other.rp0Importpath) return false
        if (this.rp0Importlist != other.rp0Importlist) return false
        if (this.rp0Logonusername != other.rp0Logonusername) return false
        if (this.rp0Interval != other.rp0Interval) return false
        if (this.rp0Pulse != other.rp0Pulse) return false
        if (this.rp0Guardtime != other.rp0Guardtime) return false
        if (this.rp0Random != other.rp0Random) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rp0Role.hashCode()
        result = 31 * result + this.rp0Exportpath.hashCode()
        result = 31 * result + this.rp0Exportlist.hashCode()
        result = 31 * result + this.rp0Importpath.hashCode()
        result = 31 * result + this.rp0Importlist.hashCode()
        result = 31 * result + this.rp0Logonusername.hashCode()
        result = 31 * result + this.rp0Interval.hashCode()
        result = 31 * result + this.rp0Pulse.hashCode()
        result = 31 * result + this.rp0Guardtime.hashCode()
        result = 31 * result + this.rp0Random.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rp0Role: UInt = 0u,
            rp0Exportpath: Pwstr = MutPtr(0L),
            rp0Exportlist: Pwstr = MutPtr(0L),
            rp0Importpath: Pwstr = MutPtr(0L),
            rp0Importlist: Pwstr = MutPtr(0L),
            rp0Logonusername: Pwstr = MutPtr(0L),
            rp0Interval: UInt = 0u,
            rp0Pulse: UInt = 0u,
            rp0Guardtime: UInt = 0u,
            rp0Random: UInt = 0u,
        ): ReplInfo0 =
            ReplInfo0(
                rp0Role = rp0Role,
                rp0ExportpathCtorArg = rp0Exportpath,
                rp0ExportlistCtorArg = rp0Exportlist,
                rp0ImportpathCtorArg = rp0Importpath,
                rp0ImportlistCtorArg = rp0Importlist,
                rp0LogonusernameCtorArg = rp0Logonusername,
                rp0Interval = rp0Interval,
                rp0Pulse = rp0Pulse,
                rp0Guardtime = rp0Guardtime,
                rp0Random = rp0Random,
            )
    }
}

public data class ReplInfo1000(
    public var rp1000Interval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplInfo1000 =
                    ReplInfo1000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplInfo1000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rp1000Interval)
                }
            }
    }
}

public data class ReplInfo1001(
    public var rp1001Pulse: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1001> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1001> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplInfo1001 =
                    ReplInfo1001(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplInfo1001) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rp1001Pulse)
                }
            }
    }
}

public data class ReplInfo1002(
    public var rp1002Guardtime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1002> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1002> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplInfo1002 =
                    ReplInfo1002(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplInfo1002) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rp1002Guardtime)
                }
            }
    }
}

public data class ReplInfo1003(
    public var rp1003Random: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1003> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReplInfo1003> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReplInfo1003 =
                    ReplInfo1003(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReplInfo1003) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rp1003Random)
                }
            }
    }
}

public data class RtrInfoBlockHeader(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var tocEntriesCount: UInt = 0u,
    public var tocEntry: List<RtrTocEntry> = List(1) { RtrTocEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtrInfoBlockHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtrInfoBlockHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): RtrInfoBlockHeader =
                    RtrInfoBlockHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RtrTocEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RtrInfoBlockHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tocEntriesCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RtrTocEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.tocEntry)
                }
            }
    }
}

public data class RtrTocEntry(
    public var infoType: UInt = 0u,
    public var infoSize: UInt = 0u,
    public var count: UInt = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtrTocEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtrTocEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RtrTocEntry =
                    RtrTocEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RtrTocEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.infoType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.infoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offset)
                }
            }
    }
}

public class ServerInfo100 internal constructor(
    public var sv100PlatformId: UInt,
    sv100NameCtorArg: Pwstr,
) {
    public var sv100Name: Pwstr = sv100NameCtorArg
        internal set

    public constructor() : this(
        sv100PlatformId = 0u,
        sv100NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sv100PlatformId

    public operator fun component2(): Pwstr = this.sv100Name

    public fun copy(sv100PlatformId: UInt = this.sv100PlatformId, sv100Name: Pwstr = this.sv100Name): ServerInfo100 = ServerInfo100(sv100PlatformId = sv100PlatformId, sv100NameCtorArg = sv100Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerInfo100) return false
        if (this.sv100PlatformId != other.sv100PlatformId) return false
        if (this.sv100Name != other.sv100Name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sv100PlatformId.hashCode()
        result = 31 * result + this.sv100Name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sv100PlatformId: UInt = 0u,
            sv100Name: Pwstr = MutPtr(0L),
        ): ServerInfo100 =
            ServerInfo100(
                sv100PlatformId = sv100PlatformId,
                sv100NameCtorArg = sv100Name,
            )
    }
}

public class ServerInfo1005 internal constructor(
    sv1005CommentCtorArg: Pwstr,
) {
    public var sv1005Comment: Pwstr = sv1005CommentCtorArg
        internal set

    public constructor() : this(
        sv1005CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.sv1005Comment

    public fun copy(sv1005Comment: Pwstr = this.sv1005Comment): ServerInfo1005 = ServerInfo1005(sv1005CommentCtorArg = sv1005Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerInfo1005) return false
        if (this.sv1005Comment != other.sv1005Comment) return false
        return true
    }

    override fun hashCode(): Int = this.sv1005Comment.hashCode()

    public companion object {
        public operator fun invoke(
            sv1005Comment: Pwstr = MutPtr(0L),
        ): ServerInfo1005 =
            ServerInfo1005(
                sv1005CommentCtorArg = sv1005Comment,
            )
    }
}

public class ServerInfo101 internal constructor(
    public var sv101PlatformId: UInt,
    sv101NameCtorArg: Pwstr,
    public var sv101VersionMajor: UInt,
    public var sv101VersionMinor: UInt,
    public var sv101Type: NetServerType,
    sv101CommentCtorArg: Pwstr,
) {
    public var sv101Name: Pwstr = sv101NameCtorArg
        internal set

    public var sv101Comment: Pwstr = sv101CommentCtorArg
        internal set

    public constructor() : this(
        sv101PlatformId = 0u,
        sv101NameCtorArg = MutPtr(0L),
        sv101VersionMajor = 0u,
        sv101VersionMinor = 0u,
        sv101Type = 0u,
        sv101CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sv101PlatformId

    public operator fun component2(): Pwstr = this.sv101Name

    public operator fun component3(): UInt = this.sv101VersionMajor

    public operator fun component4(): UInt = this.sv101VersionMinor

    public operator fun component5(): NetServerType = this.sv101Type

    public operator fun component6(): Pwstr = this.sv101Comment

    public fun copy(sv101PlatformId: UInt = this.sv101PlatformId, sv101Name: Pwstr = this.sv101Name, sv101VersionMajor: UInt = this.sv101VersionMajor, sv101VersionMinor: UInt = this.sv101VersionMinor, sv101Type: NetServerType = this.sv101Type, sv101Comment: Pwstr = this.sv101Comment): ServerInfo101 = ServerInfo101(sv101PlatformId = sv101PlatformId, sv101NameCtorArg = sv101Name, sv101VersionMajor = sv101VersionMajor, sv101VersionMinor = sv101VersionMinor, sv101Type = sv101Type, sv101CommentCtorArg = sv101Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerInfo101) return false
        if (this.sv101PlatformId != other.sv101PlatformId) return false
        if (this.sv101Name != other.sv101Name) return false
        if (this.sv101VersionMajor != other.sv101VersionMajor) return false
        if (this.sv101VersionMinor != other.sv101VersionMinor) return false
        if (this.sv101Type != other.sv101Type) return false
        if (this.sv101Comment != other.sv101Comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sv101PlatformId.hashCode()
        result = 31 * result + this.sv101Name.hashCode()
        result = 31 * result + this.sv101VersionMajor.hashCode()
        result = 31 * result + this.sv101VersionMinor.hashCode()
        result = 31 * result + this.sv101Type.hashCode()
        result = 31 * result + this.sv101Comment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sv101PlatformId: UInt = 0u,
            sv101Name: Pwstr = MutPtr(0L),
            sv101VersionMajor: UInt = 0u,
            sv101VersionMinor: UInt = 0u,
            sv101Type: NetServerType = 0u,
            sv101Comment: Pwstr = MutPtr(0L),
        ): ServerInfo101 =
            ServerInfo101(
                sv101PlatformId = sv101PlatformId,
                sv101NameCtorArg = sv101Name,
                sv101VersionMajor = sv101VersionMajor,
                sv101VersionMinor = sv101VersionMinor,
                sv101Type = sv101Type,
                sv101CommentCtorArg = sv101Comment,
            )
    }
}

public data class ServerInfo1010(
    public var sv1010Disc: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1010> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1010 =
                    ServerInfo1010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1010Disc)
                }
            }
    }
}

public data class ServerInfo1016(
    public var sv1016Hidden: ServerInfoHidden = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1016> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1016> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1016 =
                    ServerInfo1016(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1016) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1016Hidden)
                }
            }
    }
}

public data class ServerInfo1017(
    public var sv1017Announce: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1017> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1017> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1017 =
                    ServerInfo1017(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1017) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1017Announce)
                }
            }
    }
}

public data class ServerInfo1018(
    public var sv1018Anndelta: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1018> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1018> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1018 =
                    ServerInfo1018(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1018) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1018Anndelta)
                }
            }
    }
}

public class ServerInfo102 internal constructor(
    public var sv102PlatformId: UInt,
    sv102NameCtorArg: Pwstr,
    public var sv102VersionMajor: UInt,
    public var sv102VersionMinor: UInt,
    public var sv102Type: NetServerType,
    sv102CommentCtorArg: Pwstr,
    public var sv102Users: UInt,
    public var sv102Disc: Int,
    public var sv102Hidden: ServerInfoHidden,
    public var sv102Announce: UInt,
    public var sv102Anndelta: UInt,
    public var sv102Licenses: UInt,
    sv102UserpathCtorArg: Pwstr,
) {
    public var sv102Name: Pwstr = sv102NameCtorArg
        internal set

    public var sv102Comment: Pwstr = sv102CommentCtorArg
        internal set

    public var sv102Userpath: Pwstr = sv102UserpathCtorArg
        internal set

    public constructor() : this(
        sv102PlatformId = 0u,
        sv102NameCtorArg = MutPtr(0L),
        sv102VersionMajor = 0u,
        sv102VersionMinor = 0u,
        sv102Type = 0u,
        sv102CommentCtorArg = MutPtr(0L),
        sv102Users = 0u,
        sv102Disc = 0,
        sv102Hidden = 0,
        sv102Announce = 0u,
        sv102Anndelta = 0u,
        sv102Licenses = 0u,
        sv102UserpathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sv102PlatformId

    public operator fun component2(): Pwstr = this.sv102Name

    public operator fun component3(): UInt = this.sv102VersionMajor

    public operator fun component4(): UInt = this.sv102VersionMinor

    public operator fun component5(): NetServerType = this.sv102Type

    public operator fun component6(): Pwstr = this.sv102Comment

    public operator fun component7(): UInt = this.sv102Users

    public operator fun component8(): Int = this.sv102Disc

    public operator fun component9(): ServerInfoHidden = this.sv102Hidden

    public operator fun component10(): UInt = this.sv102Announce

    public operator fun component11(): UInt = this.sv102Anndelta

    public operator fun component12(): UInt = this.sv102Licenses

    public operator fun component13(): Pwstr = this.sv102Userpath

    public fun copy(sv102PlatformId: UInt = this.sv102PlatformId, sv102Name: Pwstr = this.sv102Name, sv102VersionMajor: UInt = this.sv102VersionMajor, sv102VersionMinor: UInt = this.sv102VersionMinor, sv102Type: NetServerType = this.sv102Type, sv102Comment: Pwstr = this.sv102Comment, sv102Users: UInt = this.sv102Users, sv102Disc: Int = this.sv102Disc, sv102Hidden: ServerInfoHidden = this.sv102Hidden, sv102Announce: UInt = this.sv102Announce, sv102Anndelta: UInt = this.sv102Anndelta, sv102Licenses: UInt = this.sv102Licenses, sv102Userpath: Pwstr = this.sv102Userpath): ServerInfo102 = ServerInfo102(sv102PlatformId = sv102PlatformId, sv102NameCtorArg = sv102Name, sv102VersionMajor = sv102VersionMajor, sv102VersionMinor = sv102VersionMinor, sv102Type = sv102Type, sv102CommentCtorArg = sv102Comment, sv102Users = sv102Users, sv102Disc = sv102Disc, sv102Hidden = sv102Hidden, sv102Announce = sv102Announce, sv102Anndelta = sv102Anndelta, sv102Licenses = sv102Licenses, sv102UserpathCtorArg = sv102Userpath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerInfo102) return false
        if (this.sv102PlatformId != other.sv102PlatformId) return false
        if (this.sv102Name != other.sv102Name) return false
        if (this.sv102VersionMajor != other.sv102VersionMajor) return false
        if (this.sv102VersionMinor != other.sv102VersionMinor) return false
        if (this.sv102Type != other.sv102Type) return false
        if (this.sv102Comment != other.sv102Comment) return false
        if (this.sv102Users != other.sv102Users) return false
        if (this.sv102Disc != other.sv102Disc) return false
        if (this.sv102Hidden != other.sv102Hidden) return false
        if (this.sv102Announce != other.sv102Announce) return false
        if (this.sv102Anndelta != other.sv102Anndelta) return false
        if (this.sv102Licenses != other.sv102Licenses) return false
        if (this.sv102Userpath != other.sv102Userpath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sv102PlatformId.hashCode()
        result = 31 * result + this.sv102Name.hashCode()
        result = 31 * result + this.sv102VersionMajor.hashCode()
        result = 31 * result + this.sv102VersionMinor.hashCode()
        result = 31 * result + this.sv102Type.hashCode()
        result = 31 * result + this.sv102Comment.hashCode()
        result = 31 * result + this.sv102Users.hashCode()
        result = 31 * result + this.sv102Disc.hashCode()
        result = 31 * result + this.sv102Hidden.hashCode()
        result = 31 * result + this.sv102Announce.hashCode()
        result = 31 * result + this.sv102Anndelta.hashCode()
        result = 31 * result + this.sv102Licenses.hashCode()
        result = 31 * result + this.sv102Userpath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sv102PlatformId: UInt = 0u,
            sv102Name: Pwstr = MutPtr(0L),
            sv102VersionMajor: UInt = 0u,
            sv102VersionMinor: UInt = 0u,
            sv102Type: NetServerType = 0u,
            sv102Comment: Pwstr = MutPtr(0L),
            sv102Users: UInt = 0u,
            sv102Disc: Int = 0,
            sv102Hidden: ServerInfoHidden = 0,
            sv102Announce: UInt = 0u,
            sv102Anndelta: UInt = 0u,
            sv102Licenses: UInt = 0u,
            sv102Userpath: Pwstr = MutPtr(0L),
        ): ServerInfo102 =
            ServerInfo102(
                sv102PlatformId = sv102PlatformId,
                sv102NameCtorArg = sv102Name,
                sv102VersionMajor = sv102VersionMajor,
                sv102VersionMinor = sv102VersionMinor,
                sv102Type = sv102Type,
                sv102CommentCtorArg = sv102Comment,
                sv102Users = sv102Users,
                sv102Disc = sv102Disc,
                sv102Hidden = sv102Hidden,
                sv102Announce = sv102Announce,
                sv102Anndelta = sv102Anndelta,
                sv102Licenses = sv102Licenses,
                sv102UserpathCtorArg = sv102Userpath,
            )
    }
}

public class ServerInfo103 internal constructor(
    public var sv103PlatformId: UInt,
    sv103NameCtorArg: Pwstr,
    public var sv103VersionMajor: UInt,
    public var sv103VersionMinor: UInt,
    public var sv103Type: UInt,
    sv103CommentCtorArg: Pwstr,
    public var sv103Users: UInt,
    public var sv103Disc: Int,
    public var sv103Hidden: Bool,
    public var sv103Announce: UInt,
    public var sv103Anndelta: UInt,
    public var sv103Licenses: UInt,
    sv103UserpathCtorArg: Pwstr,
    public var sv103Capabilities: UInt,
) {
    public var sv103Name: Pwstr = sv103NameCtorArg
        internal set

    public var sv103Comment: Pwstr = sv103CommentCtorArg
        internal set

    public var sv103Userpath: Pwstr = sv103UserpathCtorArg
        internal set

    public constructor() : this(
        sv103PlatformId = 0u,
        sv103NameCtorArg = MutPtr(0L),
        sv103VersionMajor = 0u,
        sv103VersionMinor = 0u,
        sv103Type = 0u,
        sv103CommentCtorArg = MutPtr(0L),
        sv103Users = 0u,
        sv103Disc = 0,
        sv103Hidden = 0,
        sv103Announce = 0u,
        sv103Anndelta = 0u,
        sv103Licenses = 0u,
        sv103UserpathCtorArg = MutPtr(0L),
        sv103Capabilities = 0u,
    )

    public operator fun component1(): UInt = this.sv103PlatformId

    public operator fun component2(): Pwstr = this.sv103Name

    public operator fun component3(): UInt = this.sv103VersionMajor

    public operator fun component4(): UInt = this.sv103VersionMinor

    public operator fun component5(): UInt = this.sv103Type

    public operator fun component6(): Pwstr = this.sv103Comment

    public operator fun component7(): UInt = this.sv103Users

    public operator fun component8(): Int = this.sv103Disc

    public operator fun component9(): Bool = this.sv103Hidden

    public operator fun component10(): UInt = this.sv103Announce

    public operator fun component11(): UInt = this.sv103Anndelta

    public operator fun component12(): UInt = this.sv103Licenses

    public operator fun component13(): Pwstr = this.sv103Userpath

    public operator fun component14(): UInt = this.sv103Capabilities

    public fun copy(sv103PlatformId: UInt = this.sv103PlatformId, sv103Name: Pwstr = this.sv103Name, sv103VersionMajor: UInt = this.sv103VersionMajor, sv103VersionMinor: UInt = this.sv103VersionMinor, sv103Type: UInt = this.sv103Type, sv103Comment: Pwstr = this.sv103Comment, sv103Users: UInt = this.sv103Users, sv103Disc: Int = this.sv103Disc, sv103Hidden: Bool = this.sv103Hidden, sv103Announce: UInt = this.sv103Announce, sv103Anndelta: UInt = this.sv103Anndelta, sv103Licenses: UInt = this.sv103Licenses, sv103Userpath: Pwstr = this.sv103Userpath, sv103Capabilities: UInt = this.sv103Capabilities): ServerInfo103 = ServerInfo103(sv103PlatformId = sv103PlatformId, sv103NameCtorArg = sv103Name, sv103VersionMajor = sv103VersionMajor, sv103VersionMinor = sv103VersionMinor, sv103Type = sv103Type, sv103CommentCtorArg = sv103Comment, sv103Users = sv103Users, sv103Disc = sv103Disc, sv103Hidden = sv103Hidden, sv103Announce = sv103Announce, sv103Anndelta = sv103Anndelta, sv103Licenses = sv103Licenses, sv103UserpathCtorArg = sv103Userpath, sv103Capabilities = sv103Capabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerInfo103) return false
        if (this.sv103PlatformId != other.sv103PlatformId) return false
        if (this.sv103Name != other.sv103Name) return false
        if (this.sv103VersionMajor != other.sv103VersionMajor) return false
        if (this.sv103VersionMinor != other.sv103VersionMinor) return false
        if (this.sv103Type != other.sv103Type) return false
        if (this.sv103Comment != other.sv103Comment) return false
        if (this.sv103Users != other.sv103Users) return false
        if (this.sv103Disc != other.sv103Disc) return false
        if (this.sv103Hidden != other.sv103Hidden) return false
        if (this.sv103Announce != other.sv103Announce) return false
        if (this.sv103Anndelta != other.sv103Anndelta) return false
        if (this.sv103Licenses != other.sv103Licenses) return false
        if (this.sv103Userpath != other.sv103Userpath) return false
        if (this.sv103Capabilities != other.sv103Capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sv103PlatformId.hashCode()
        result = 31 * result + this.sv103Name.hashCode()
        result = 31 * result + this.sv103VersionMajor.hashCode()
        result = 31 * result + this.sv103VersionMinor.hashCode()
        result = 31 * result + this.sv103Type.hashCode()
        result = 31 * result + this.sv103Comment.hashCode()
        result = 31 * result + this.sv103Users.hashCode()
        result = 31 * result + this.sv103Disc.hashCode()
        result = 31 * result + this.sv103Hidden.hashCode()
        result = 31 * result + this.sv103Announce.hashCode()
        result = 31 * result + this.sv103Anndelta.hashCode()
        result = 31 * result + this.sv103Licenses.hashCode()
        result = 31 * result + this.sv103Userpath.hashCode()
        result = 31 * result + this.sv103Capabilities.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sv103PlatformId: UInt = 0u,
            sv103Name: Pwstr = MutPtr(0L),
            sv103VersionMajor: UInt = 0u,
            sv103VersionMinor: UInt = 0u,
            sv103Type: UInt = 0u,
            sv103Comment: Pwstr = MutPtr(0L),
            sv103Users: UInt = 0u,
            sv103Disc: Int = 0,
            sv103Hidden: Bool = 0,
            sv103Announce: UInt = 0u,
            sv103Anndelta: UInt = 0u,
            sv103Licenses: UInt = 0u,
            sv103Userpath: Pwstr = MutPtr(0L),
            sv103Capabilities: UInt = 0u,
        ): ServerInfo103 =
            ServerInfo103(
                sv103PlatformId = sv103PlatformId,
                sv103NameCtorArg = sv103Name,
                sv103VersionMajor = sv103VersionMajor,
                sv103VersionMinor = sv103VersionMinor,
                sv103Type = sv103Type,
                sv103CommentCtorArg = sv103Comment,
                sv103Users = sv103Users,
                sv103Disc = sv103Disc,
                sv103Hidden = sv103Hidden,
                sv103Announce = sv103Announce,
                sv103Anndelta = sv103Anndelta,
                sv103Licenses = sv103Licenses,
                sv103UserpathCtorArg = sv103Userpath,
                sv103Capabilities = sv103Capabilities,
            )
    }
}

public data class ServerInfo1107(
    public var sv1107Users: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1107> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1107> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1107 =
                    ServerInfo1107(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1107) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1107Users)
                }
            }
    }
}

public data class ServerInfo1501(
    public var sv1501Sessopens: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1501> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1501> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1501 =
                    ServerInfo1501(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1501) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1501Sessopens)
                }
            }
    }
}

public data class ServerInfo1502(
    public var sv1502Sessvcs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1502> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1502> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1502 =
                    ServerInfo1502(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1502) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1502Sessvcs)
                }
            }
    }
}

public data class ServerInfo1503(
    public var sv1503Opensearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1503> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1503> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1503 =
                    ServerInfo1503(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1503) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1503Opensearch)
                }
            }
    }
}

public data class ServerInfo1506(
    public var sv1506Maxworkitems: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1506> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1506> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1506 =
                    ServerInfo1506(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1506) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1506Maxworkitems)
                }
            }
    }
}

public data class ServerInfo1509(
    public var sv1509Maxrawbuflen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1509> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1509> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1509 =
                    ServerInfo1509(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1509) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1509Maxrawbuflen)
                }
            }
    }
}

public data class ServerInfo1510(
    public var sv1510Sessusers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1510> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1510> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1510 =
                    ServerInfo1510(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1510) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1510Sessusers)
                }
            }
    }
}

public data class ServerInfo1511(
    public var sv1511Sessconns: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1511> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1511> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1511 =
                    ServerInfo1511(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1511) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1511Sessconns)
                }
            }
    }
}

public data class ServerInfo1512(
    public var sv1512Maxnonpagedmemoryusage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1512> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1512> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1512 =
                    ServerInfo1512(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1512) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1512Maxnonpagedmemoryusage)
                }
            }
    }
}

public data class ServerInfo1513(
    public var sv1513Maxpagedmemoryusage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1513> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1513> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1513 =
                    ServerInfo1513(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1513) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1513Maxpagedmemoryusage)
                }
            }
    }
}

public data class ServerInfo1514(
    public var sv1514Enablesoftcompat: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1514> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1514> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1514 =
                    ServerInfo1514(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1514) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1514Enablesoftcompat)
                }
            }
    }
}

public data class ServerInfo1515(
    public var sv1515Enableforcedlogoff: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1515> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1515> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1515 =
                    ServerInfo1515(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1515) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1515Enableforcedlogoff)
                }
            }
    }
}

public data class ServerInfo1516(
    public var sv1516Timesource: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1516> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1516> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1516 =
                    ServerInfo1516(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1516) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1516Timesource)
                }
            }
    }
}

public data class ServerInfo1518(
    public var sv1518Lmannounce: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1518> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1518> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1518 =
                    ServerInfo1518(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1518) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1518Lmannounce)
                }
            }
    }
}

public data class ServerInfo1520(
    public var sv1520Maxcopyreadlen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1520> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1520> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1520 =
                    ServerInfo1520(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1520) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1520Maxcopyreadlen)
                }
            }
    }
}

public data class ServerInfo1521(
    public var sv1521Maxcopywritelen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1521> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1521> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1521 =
                    ServerInfo1521(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1521) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1521Maxcopywritelen)
                }
            }
    }
}

public data class ServerInfo1522(
    public var sv1522Minkeepsearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1522> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1522> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1522 =
                    ServerInfo1522(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1522) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1522Minkeepsearch)
                }
            }
    }
}

public data class ServerInfo1523(
    public var sv1523Maxkeepsearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1523> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1523> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1523 =
                    ServerInfo1523(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1523) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1523Maxkeepsearch)
                }
            }
    }
}

public data class ServerInfo1524(
    public var sv1524Minkeepcomplsearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1524> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1524> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1524 =
                    ServerInfo1524(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1524) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1524Minkeepcomplsearch)
                }
            }
    }
}

public data class ServerInfo1525(
    public var sv1525Maxkeepcomplsearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1525> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1525> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1525 =
                    ServerInfo1525(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1525) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1525Maxkeepcomplsearch)
                }
            }
    }
}

public data class ServerInfo1528(
    public var sv1528Scavtimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1528> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1528> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1528 =
                    ServerInfo1528(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1528) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1528Scavtimeout)
                }
            }
    }
}

public data class ServerInfo1529(
    public var sv1529Minrcvqueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1529> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1529> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1529 =
                    ServerInfo1529(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1529) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1529Minrcvqueue)
                }
            }
    }
}

public data class ServerInfo1530(
    public var sv1530Minfreeworkitems: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1530> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1530> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1530 =
                    ServerInfo1530(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1530) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1530Minfreeworkitems)
                }
            }
    }
}

public data class ServerInfo1533(
    public var sv1533Maxmpxct: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1533> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1533> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1533 =
                    ServerInfo1533(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1533) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1533Maxmpxct)
                }
            }
    }
}

public data class ServerInfo1534(
    public var sv1534Oplockbreakwait: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1534> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1534> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1534 =
                    ServerInfo1534(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1534) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1534Oplockbreakwait)
                }
            }
    }
}

public data class ServerInfo1535(
    public var sv1535Oplockbreakresponsewait: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1535> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1535> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1535 =
                    ServerInfo1535(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1535) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1535Oplockbreakresponsewait)
                }
            }
    }
}

public data class ServerInfo1536(
    public var sv1536Enableoplocks: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1536> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1536> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1536 =
                    ServerInfo1536(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1536) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1536Enableoplocks)
                }
            }
    }
}

public data class ServerInfo1537(
    public var sv1537Enableoplockforceclose: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1537> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1537> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1537 =
                    ServerInfo1537(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1537) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1537Enableoplockforceclose)
                }
            }
    }
}

public data class ServerInfo1538(
    public var sv1538Enablefcbopens: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1538> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1538> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1538 =
                    ServerInfo1538(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1538) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1538Enablefcbopens)
                }
            }
    }
}

public data class ServerInfo1539(
    public var sv1539Enableraw: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1539> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1539> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1539 =
                    ServerInfo1539(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1539) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1539Enableraw)
                }
            }
    }
}

public data class ServerInfo1540(
    public var sv1540Enablesharednetdrives: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1540> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1540> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1540 =
                    ServerInfo1540(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1540) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1540Enablesharednetdrives)
                }
            }
    }
}

public data class ServerInfo1541(
    public var sv1541Minfreeconnections: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1541> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1541> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1541 =
                    ServerInfo1541(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1541) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1541Minfreeconnections)
                }
            }
    }
}

public data class ServerInfo1542(
    public var sv1542Maxfreeconnections: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1542> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1542> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1542 =
                    ServerInfo1542(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1542) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1542Maxfreeconnections)
                }
            }
    }
}

public data class ServerInfo1543(
    public var sv1543Initsesstable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1543> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1543> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1543 =
                    ServerInfo1543(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1543) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1543Initsesstable)
                }
            }
    }
}

public data class ServerInfo1544(
    public var sv1544Initconntable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1544> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1544> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1544 =
                    ServerInfo1544(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1544) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1544Initconntable)
                }
            }
    }
}

public data class ServerInfo1545(
    public var sv1545Initfiletable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1545> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1545> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1545 =
                    ServerInfo1545(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1545) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1545Initfiletable)
                }
            }
    }
}

public data class ServerInfo1546(
    public var sv1546Initsearchtable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1546> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1546> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1546 =
                    ServerInfo1546(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1546) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1546Initsearchtable)
                }
            }
    }
}

public data class ServerInfo1547(
    public var sv1547Alertschedule: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1547> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1547> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1547 =
                    ServerInfo1547(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1547) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1547Alertschedule)
                }
            }
    }
}

public data class ServerInfo1548(
    public var sv1548Errorthreshold: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1548> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1548> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1548 =
                    ServerInfo1548(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1548) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1548Errorthreshold)
                }
            }
    }
}

public data class ServerInfo1549(
    public var sv1549Networkerrorthreshold: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1549> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1549> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1549 =
                    ServerInfo1549(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1549) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1549Networkerrorthreshold)
                }
            }
    }
}

public data class ServerInfo1550(
    public var sv1550Diskspacethreshold: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1550> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1550> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1550 =
                    ServerInfo1550(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1550) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1550Diskspacethreshold)
                }
            }
    }
}

public data class ServerInfo1552(
    public var sv1552Maxlinkdelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1552> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1552> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1552 =
                    ServerInfo1552(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1552) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1552Maxlinkdelay)
                }
            }
    }
}

public data class ServerInfo1553(
    public var sv1553Minlinkthroughput: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1553> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1553> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1553 =
                    ServerInfo1553(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1553) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1553Minlinkthroughput)
                }
            }
    }
}

public data class ServerInfo1554(
    public var sv1554Linkinfovalidtime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1554> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1554> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1554 =
                    ServerInfo1554(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1554) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1554Linkinfovalidtime)
                }
            }
    }
}

public data class ServerInfo1555(
    public var sv1555Scavqosinfoupdatetime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1555> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1555> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1555 =
                    ServerInfo1555(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1555) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1555Scavqosinfoupdatetime)
                }
            }
    }
}

public data class ServerInfo1556(
    public var sv1556Maxworkitemidletime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1556> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1556> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1556 =
                    ServerInfo1556(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1556) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1556Maxworkitemidletime)
                }
            }
    }
}

public data class ServerInfo1557(
    public var sv1557Maxrawworkitems: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1557> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1557> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1557 =
                    ServerInfo1557(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1557) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1557Maxrawworkitems)
                }
            }
    }
}

public data class ServerInfo1560(
    public var sv1560Producttype: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1560> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1560> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1560 =
                    ServerInfo1560(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1560) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1560Producttype)
                }
            }
    }
}

public data class ServerInfo1561(
    public var sv1561Serversize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1561> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1561> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1561 =
                    ServerInfo1561(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1561) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1561Serversize)
                }
            }
    }
}

public data class ServerInfo1562(
    public var sv1562Connectionlessautodisc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1562> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1562> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1562 =
                    ServerInfo1562(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1562) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1562Connectionlessautodisc)
                }
            }
    }
}

public data class ServerInfo1563(
    public var sv1563Sharingviolationretries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1563> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1563> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1563 =
                    ServerInfo1563(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1563) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1563Sharingviolationretries)
                }
            }
    }
}

public data class ServerInfo1564(
    public var sv1564Sharingviolationdelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1564> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1564> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1564 =
                    ServerInfo1564(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1564) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1564Sharingviolationdelay)
                }
            }
    }
}

public data class ServerInfo1565(
    public var sv1565Maxglobalopensearch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1565> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1565> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1565 =
                    ServerInfo1565(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1565) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1565Maxglobalopensearch)
                }
            }
    }
}

public data class ServerInfo1566(
    public var sv1566Removeduplicatesearches: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1566> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1566> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1566 =
                    ServerInfo1566(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1566) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1566Removeduplicatesearches)
                }
            }
    }
}

public data class ServerInfo1567(
    public var sv1567Lockviolationretries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1567> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1567> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1567 =
                    ServerInfo1567(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1567) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1567Lockviolationretries)
                }
            }
    }
}

public data class ServerInfo1568(
    public var sv1568Lockviolationoffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1568> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1568> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1568 =
                    ServerInfo1568(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1568) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1568Lockviolationoffset)
                }
            }
    }
}

public data class ServerInfo1569(
    public var sv1569Lockviolationdelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1569> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1569> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1569 =
                    ServerInfo1569(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1569) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1569Lockviolationdelay)
                }
            }
    }
}

public data class ServerInfo1570(
    public var sv1570Mdlreadswitchover: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1570> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1570> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1570 =
                    ServerInfo1570(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1570) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1570Mdlreadswitchover)
                }
            }
    }
}

public data class ServerInfo1571(
    public var sv1571Cachedopenlimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1571> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1571> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1571 =
                    ServerInfo1571(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1571) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1571Cachedopenlimit)
                }
            }
    }
}

public data class ServerInfo1572(
    public var sv1572Criticalthreads: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1572> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1572> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1572 =
                    ServerInfo1572(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1572) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1572Criticalthreads)
                }
            }
    }
}

public data class ServerInfo1573(
    public var sv1573Restrictnullsessaccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1573> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1573> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1573 =
                    ServerInfo1573(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1573) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1573Restrictnullsessaccess)
                }
            }
    }
}

public data class ServerInfo1574(
    public var sv1574Enablewfw311directipx: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1574> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1574> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1574 =
                    ServerInfo1574(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1574) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1574Enablewfw311directipx)
                }
            }
    }
}

public data class ServerInfo1575(
    public var sv1575Otherqueueaffinity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1575> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1575> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1575 =
                    ServerInfo1575(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1575) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1575Otherqueueaffinity)
                }
            }
    }
}

public data class ServerInfo1576(
    public var sv1576Queuesamplesecs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1576> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1576> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1576 =
                    ServerInfo1576(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1576) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1576Queuesamplesecs)
                }
            }
    }
}

public data class ServerInfo1577(
    public var sv1577Balancecount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1577> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1577> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1577 =
                    ServerInfo1577(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1577) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1577Balancecount)
                }
            }
    }
}

public data class ServerInfo1578(
    public var sv1578Preferredaffinity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1578> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1578> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1578 =
                    ServerInfo1578(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1578) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1578Preferredaffinity)
                }
            }
    }
}

public data class ServerInfo1579(
    public var sv1579Maxfreerfcbs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1579> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1579> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1579 =
                    ServerInfo1579(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1579) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1579Maxfreerfcbs)
                }
            }
    }
}

public data class ServerInfo1580(
    public var sv1580Maxfreemfcbs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1580> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1580> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1580 =
                    ServerInfo1580(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1580) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1580Maxfreemfcbs)
                }
            }
    }
}

public data class ServerInfo1581(
    public var sv1581Maxfreemlcbs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1581> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1581> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1581 =
                    ServerInfo1581(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1581) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1581Maxfreemlcbs)
                }
            }
    }
}

public data class ServerInfo1582(
    public var sv1582Maxfreepagedpoolchunks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1582> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1582> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1582 =
                    ServerInfo1582(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1582) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1582Maxfreepagedpoolchunks)
                }
            }
    }
}

public data class ServerInfo1583(
    public var sv1583Minpagedpoolchunksize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1583> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1583> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1583 =
                    ServerInfo1583(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1583) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1583Minpagedpoolchunksize)
                }
            }
    }
}

public data class ServerInfo1584(
    public var sv1584Maxpagedpoolchunksize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1584> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1584> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1584 =
                    ServerInfo1584(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1584) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1584Maxpagedpoolchunksize)
                }
            }
    }
}

public data class ServerInfo1585(
    public var sv1585Sendsfrompreferredprocessor: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1585> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1585> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1585 =
                    ServerInfo1585(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1585) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1585Sendsfrompreferredprocessor)
                }
            }
    }
}

public data class ServerInfo1586(
    public var sv1586Maxthreadsperqueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1586> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1586> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1586 =
                    ServerInfo1586(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1586) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1586Maxthreadsperqueue)
                }
            }
    }
}

public data class ServerInfo1587(
    public var sv1587Cacheddirectorylimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1587> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1587> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1587 =
                    ServerInfo1587(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1587) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1587Cacheddirectorylimit)
                }
            }
    }
}

public data class ServerInfo1588(
    public var sv1588Maxcopylength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1588> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1588> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1588 =
                    ServerInfo1588(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1588) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1588Maxcopylength)
                }
            }
    }
}

public data class ServerInfo1590(
    public var sv1590Enablecompression: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1590> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1590> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1590 =
                    ServerInfo1590(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1590) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1590Enablecompression)
                }
            }
    }
}

public data class ServerInfo1591(
    public var sv1591Autosharewks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1591> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1591> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1591 =
                    ServerInfo1591(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1591) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1591Autosharewks)
                }
            }
    }
}

public data class ServerInfo1592(
    public var sv1592Autosharewks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1592> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1592> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1592 =
                    ServerInfo1592(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1592) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1592Autosharewks)
                }
            }
    }
}

public data class ServerInfo1593(
    public var sv1593Enablesecuritysignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1593> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1593> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1593 =
                    ServerInfo1593(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1593) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1593Enablesecuritysignature)
                }
            }
    }
}

public data class ServerInfo1594(
    public var sv1594Requiresecuritysignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1594> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1594> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1594 =
                    ServerInfo1594(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1594) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1594Requiresecuritysignature)
                }
            }
    }
}

public data class ServerInfo1595(
    public var sv1595Minclientbuffersize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1595> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1595> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1595 =
                    ServerInfo1595(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1595) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1595Minclientbuffersize)
                }
            }
    }
}

public data class ServerInfo1596(
    public var sv1596ConnectionNoSessionsTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1596> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1596> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1596 =
                    ServerInfo1596(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1596) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1596ConnectionNoSessionsTimeout)
                }
            }
    }
}

public data class ServerInfo1597(
    public var sv1597IdleThreadTimeOut: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1597> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1597> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1597 =
                    ServerInfo1597(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1597) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1597IdleThreadTimeOut)
                }
            }
    }
}

public data class ServerInfo1598(
    public var sv1598EnableW9xsecuritysignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1598> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1598> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1598 =
                    ServerInfo1598(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1598) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1598EnableW9xsecuritysignature)
                }
            }
    }
}

public data class ServerInfo1599(
    public var sv1598Enforcekerberosreauthentication: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1599> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1599> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ServerInfo1599 =
                    ServerInfo1599(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1599) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.sv1598Enforcekerberosreauthentication)
                }
            }
    }
}

public data class ServerInfo1600(
    public var sv1598Disabledos: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1600> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1600> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ServerInfo1600 =
                    ServerInfo1600(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1600) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.sv1598Disabledos)
                }
            }
    }
}

public data class ServerInfo1601(
    public var sv1598Lowdiskspaceminimum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1601> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1601> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1601 =
                    ServerInfo1601(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1601) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv1598Lowdiskspaceminimum)
                }
            }
    }
}

public data class ServerInfo1602(
    public var sv1598Disablestrictnamechecking: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1602> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo1602> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServerInfo1602 =
                    ServerInfo1602(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServerInfo1602) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sv1598Disablestrictnamechecking)
                }
            }
    }
}

public class ServerInfo402 internal constructor(
    public var sv402UlistMtime: UInt,
    public var sv402GlistMtime: UInt,
    public var sv402AlistMtime: UInt,
    sv402AlertsCtorArg: Pwstr,
    public var sv402Security: ServerInfoSecurity,
    public var sv402Numadmin: UInt,
    public var sv402Lanmask: UInt,
    sv402GuestacctCtorArg: Pwstr,
    public var sv402Chdevs: UInt,
    public var sv402Chdevq: UInt,
    public var sv402Chdevjobs: UInt,
    public var sv402Connections: UInt,
    public var sv402Shares: UInt,
    public var sv402Openfiles: UInt,
    public var sv402Sessopens: UInt,
    public var sv402Sessvcs: UInt,
    public var sv402Sessreqs: UInt,
    public var sv402Opensearch: UInt,
    public var sv402Activelocks: UInt,
    public var sv402Numreqbuf: UInt,
    public var sv402Sizreqbuf: UInt,
    public var sv402Numbigbuf: UInt,
    public var sv402Numfiletasks: UInt,
    public var sv402Alertsched: UInt,
    public var sv402Erroralert: UInt,
    public var sv402Logonalert: UInt,
    public var sv402Accessalert: UInt,
    public var sv402Diskalert: UInt,
    public var sv402Netioalert: UInt,
    public var sv402Maxauditsz: UInt,
    sv402SrvheuristicsCtorArg: Pwstr,
) {
    public var sv402Alerts: Pwstr = sv402AlertsCtorArg
        internal set

    public var sv402Guestacct: Pwstr = sv402GuestacctCtorArg
        internal set

    public var sv402Srvheuristics: Pwstr = sv402SrvheuristicsCtorArg
        internal set

    public constructor() : this(
        sv402UlistMtime = 0u,
        sv402GlistMtime = 0u,
        sv402AlistMtime = 0u,
        sv402AlertsCtorArg = MutPtr(0L),
        sv402Security = 0u,
        sv402Numadmin = 0u,
        sv402Lanmask = 0u,
        sv402GuestacctCtorArg = MutPtr(0L),
        sv402Chdevs = 0u,
        sv402Chdevq = 0u,
        sv402Chdevjobs = 0u,
        sv402Connections = 0u,
        sv402Shares = 0u,
        sv402Openfiles = 0u,
        sv402Sessopens = 0u,
        sv402Sessvcs = 0u,
        sv402Sessreqs = 0u,
        sv402Opensearch = 0u,
        sv402Activelocks = 0u,
        sv402Numreqbuf = 0u,
        sv402Sizreqbuf = 0u,
        sv402Numbigbuf = 0u,
        sv402Numfiletasks = 0u,
        sv402Alertsched = 0u,
        sv402Erroralert = 0u,
        sv402Logonalert = 0u,
        sv402Accessalert = 0u,
        sv402Diskalert = 0u,
        sv402Netioalert = 0u,
        sv402Maxauditsz = 0u,
        sv402SrvheuristicsCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sv402UlistMtime: UInt = 0u,
            sv402GlistMtime: UInt = 0u,
            sv402AlistMtime: UInt = 0u,
            sv402Alerts: Pwstr = MutPtr(0L),
            sv402Security: ServerInfoSecurity = 0u,
            sv402Numadmin: UInt = 0u,
            sv402Lanmask: UInt = 0u,
            sv402Guestacct: Pwstr = MutPtr(0L),
            sv402Chdevs: UInt = 0u,
            sv402Chdevq: UInt = 0u,
            sv402Chdevjobs: UInt = 0u,
            sv402Connections: UInt = 0u,
            sv402Shares: UInt = 0u,
            sv402Openfiles: UInt = 0u,
            sv402Sessopens: UInt = 0u,
            sv402Sessvcs: UInt = 0u,
            sv402Sessreqs: UInt = 0u,
            sv402Opensearch: UInt = 0u,
            sv402Activelocks: UInt = 0u,
            sv402Numreqbuf: UInt = 0u,
            sv402Sizreqbuf: UInt = 0u,
            sv402Numbigbuf: UInt = 0u,
            sv402Numfiletasks: UInt = 0u,
            sv402Alertsched: UInt = 0u,
            sv402Erroralert: UInt = 0u,
            sv402Logonalert: UInt = 0u,
            sv402Accessalert: UInt = 0u,
            sv402Diskalert: UInt = 0u,
            sv402Netioalert: UInt = 0u,
            sv402Maxauditsz: UInt = 0u,
            sv402Srvheuristics: Pwstr = MutPtr(0L),
        ): ServerInfo402 =
            ServerInfo402(
                sv402UlistMtime = sv402UlistMtime,
                sv402GlistMtime = sv402GlistMtime,
                sv402AlistMtime = sv402AlistMtime,
                sv402AlertsCtorArg = sv402Alerts,
                sv402Security = sv402Security,
                sv402Numadmin = sv402Numadmin,
                sv402Lanmask = sv402Lanmask,
                sv402GuestacctCtorArg = sv402Guestacct,
                sv402Chdevs = sv402Chdevs,
                sv402Chdevq = sv402Chdevq,
                sv402Chdevjobs = sv402Chdevjobs,
                sv402Connections = sv402Connections,
                sv402Shares = sv402Shares,
                sv402Openfiles = sv402Openfiles,
                sv402Sessopens = sv402Sessopens,
                sv402Sessvcs = sv402Sessvcs,
                sv402Sessreqs = sv402Sessreqs,
                sv402Opensearch = sv402Opensearch,
                sv402Activelocks = sv402Activelocks,
                sv402Numreqbuf = sv402Numreqbuf,
                sv402Sizreqbuf = sv402Sizreqbuf,
                sv402Numbigbuf = sv402Numbigbuf,
                sv402Numfiletasks = sv402Numfiletasks,
                sv402Alertsched = sv402Alertsched,
                sv402Erroralert = sv402Erroralert,
                sv402Logonalert = sv402Logonalert,
                sv402Accessalert = sv402Accessalert,
                sv402Diskalert = sv402Diskalert,
                sv402Netioalert = sv402Netioalert,
                sv402Maxauditsz = sv402Maxauditsz,
                sv402SrvheuristicsCtorArg = sv402Srvheuristics,
            )
    }
}

public class ServerInfo403 internal constructor(
    public var sv403UlistMtime: UInt,
    public var sv403GlistMtime: UInt,
    public var sv403AlistMtime: UInt,
    sv403AlertsCtorArg: Pwstr,
    public var sv403Security: ServerInfoSecurity,
    public var sv403Numadmin: UInt,
    public var sv403Lanmask: UInt,
    sv403GuestacctCtorArg: Pwstr,
    public var sv403Chdevs: UInt,
    public var sv403Chdevq: UInt,
    public var sv403Chdevjobs: UInt,
    public var sv403Connections: UInt,
    public var sv403Shares: UInt,
    public var sv403Openfiles: UInt,
    public var sv403Sessopens: UInt,
    public var sv403Sessvcs: UInt,
    public var sv403Sessreqs: UInt,
    public var sv403Opensearch: UInt,
    public var sv403Activelocks: UInt,
    public var sv403Numreqbuf: UInt,
    public var sv403Sizreqbuf: UInt,
    public var sv403Numbigbuf: UInt,
    public var sv403Numfiletasks: UInt,
    public var sv403Alertsched: UInt,
    public var sv403Erroralert: UInt,
    public var sv403Logonalert: UInt,
    public var sv403Accessalert: UInt,
    public var sv403Diskalert: UInt,
    public var sv403Netioalert: UInt,
    public var sv403Maxauditsz: UInt,
    sv403SrvheuristicsCtorArg: Pwstr,
    public var sv403Auditedevents: UInt,
    public var sv403Autoprofile: UInt,
    sv403AutopathCtorArg: Pwstr,
) {
    public var sv403Alerts: Pwstr = sv403AlertsCtorArg
        internal set

    public var sv403Guestacct: Pwstr = sv403GuestacctCtorArg
        internal set

    public var sv403Srvheuristics: Pwstr = sv403SrvheuristicsCtorArg
        internal set

    public var sv403Autopath: Pwstr = sv403AutopathCtorArg
        internal set

    public constructor() : this(
        sv403UlistMtime = 0u,
        sv403GlistMtime = 0u,
        sv403AlistMtime = 0u,
        sv403AlertsCtorArg = MutPtr(0L),
        sv403Security = 0u,
        sv403Numadmin = 0u,
        sv403Lanmask = 0u,
        sv403GuestacctCtorArg = MutPtr(0L),
        sv403Chdevs = 0u,
        sv403Chdevq = 0u,
        sv403Chdevjobs = 0u,
        sv403Connections = 0u,
        sv403Shares = 0u,
        sv403Openfiles = 0u,
        sv403Sessopens = 0u,
        sv403Sessvcs = 0u,
        sv403Sessreqs = 0u,
        sv403Opensearch = 0u,
        sv403Activelocks = 0u,
        sv403Numreqbuf = 0u,
        sv403Sizreqbuf = 0u,
        sv403Numbigbuf = 0u,
        sv403Numfiletasks = 0u,
        sv403Alertsched = 0u,
        sv403Erroralert = 0u,
        sv403Logonalert = 0u,
        sv403Accessalert = 0u,
        sv403Diskalert = 0u,
        sv403Netioalert = 0u,
        sv403Maxauditsz = 0u,
        sv403SrvheuristicsCtorArg = MutPtr(0L),
        sv403Auditedevents = 0u,
        sv403Autoprofile = 0u,
        sv403AutopathCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            sv403UlistMtime: UInt = 0u,
            sv403GlistMtime: UInt = 0u,
            sv403AlistMtime: UInt = 0u,
            sv403Alerts: Pwstr = MutPtr(0L),
            sv403Security: ServerInfoSecurity = 0u,
            sv403Numadmin: UInt = 0u,
            sv403Lanmask: UInt = 0u,
            sv403Guestacct: Pwstr = MutPtr(0L),
            sv403Chdevs: UInt = 0u,
            sv403Chdevq: UInt = 0u,
            sv403Chdevjobs: UInt = 0u,
            sv403Connections: UInt = 0u,
            sv403Shares: UInt = 0u,
            sv403Openfiles: UInt = 0u,
            sv403Sessopens: UInt = 0u,
            sv403Sessvcs: UInt = 0u,
            sv403Sessreqs: UInt = 0u,
            sv403Opensearch: UInt = 0u,
            sv403Activelocks: UInt = 0u,
            sv403Numreqbuf: UInt = 0u,
            sv403Sizreqbuf: UInt = 0u,
            sv403Numbigbuf: UInt = 0u,
            sv403Numfiletasks: UInt = 0u,
            sv403Alertsched: UInt = 0u,
            sv403Erroralert: UInt = 0u,
            sv403Logonalert: UInt = 0u,
            sv403Accessalert: UInt = 0u,
            sv403Diskalert: UInt = 0u,
            sv403Netioalert: UInt = 0u,
            sv403Maxauditsz: UInt = 0u,
            sv403Srvheuristics: Pwstr = MutPtr(0L),
            sv403Auditedevents: UInt = 0u,
            sv403Autoprofile: UInt = 0u,
            sv403Autopath: Pwstr = MutPtr(0L),
        ): ServerInfo403 =
            ServerInfo403(
                sv403UlistMtime = sv403UlistMtime,
                sv403GlistMtime = sv403GlistMtime,
                sv403AlistMtime = sv403AlistMtime,
                sv403AlertsCtorArg = sv403Alerts,
                sv403Security = sv403Security,
                sv403Numadmin = sv403Numadmin,
                sv403Lanmask = sv403Lanmask,
                sv403GuestacctCtorArg = sv403Guestacct,
                sv403Chdevs = sv403Chdevs,
                sv403Chdevq = sv403Chdevq,
                sv403Chdevjobs = sv403Chdevjobs,
                sv403Connections = sv403Connections,
                sv403Shares = sv403Shares,
                sv403Openfiles = sv403Openfiles,
                sv403Sessopens = sv403Sessopens,
                sv403Sessvcs = sv403Sessvcs,
                sv403Sessreqs = sv403Sessreqs,
                sv403Opensearch = sv403Opensearch,
                sv403Activelocks = sv403Activelocks,
                sv403Numreqbuf = sv403Numreqbuf,
                sv403Sizreqbuf = sv403Sizreqbuf,
                sv403Numbigbuf = sv403Numbigbuf,
                sv403Numfiletasks = sv403Numfiletasks,
                sv403Alertsched = sv403Alertsched,
                sv403Erroralert = sv403Erroralert,
                sv403Logonalert = sv403Logonalert,
                sv403Accessalert = sv403Accessalert,
                sv403Diskalert = sv403Diskalert,
                sv403Netioalert = sv403Netioalert,
                sv403Maxauditsz = sv403Maxauditsz,
                sv403SrvheuristicsCtorArg = sv403Srvheuristics,
                sv403Auditedevents = sv403Auditedevents,
                sv403Autoprofile = sv403Autoprofile,
                sv403AutopathCtorArg = sv403Autopath,
            )
    }
}

public class ServerInfo502(
    public var sv502Sessopens: UInt = 0u,
    public var sv502Sessvcs: UInt = 0u,
    public var sv502Opensearch: UInt = 0u,
    public var sv502Sizreqbuf: UInt = 0u,
    public var sv502Initworkitems: UInt = 0u,
    public var sv502Maxworkitems: UInt = 0u,
    public var sv502Rawworkitems: UInt = 0u,
    public var sv502Irpstacksize: UInt = 0u,
    public var sv502Maxrawbuflen: UInt = 0u,
    public var sv502Sessusers: UInt = 0u,
    public var sv502Sessconns: UInt = 0u,
    public var sv502Maxpagedmemoryusage: UInt = 0u,
    public var sv502Maxnonpagedmemoryusage: UInt = 0u,
    public var sv502Enablesoftcompat: Bool = 0,
    public var sv502Enableforcedlogoff: Bool = 0,
    public var sv502Timesource: Bool = 0,
    public var sv502Acceptdownlevelapis: Bool = 0,
    public var sv502Lmannounce: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo502> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServerInfo502> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): ServerInfo502 =
                    ServerInfo502(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: ServerInfo502) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sv502Sessopens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sv502Sessvcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sv502Opensearch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sv502Sizreqbuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sv502Initworkitems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sv502Maxworkitems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sv502Rawworkitems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sv502Irpstacksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sv502Maxrawbuflen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sv502Sessusers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.sv502Sessconns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.sv502Maxpagedmemoryusage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.sv502Maxnonpagedmemoryusage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.sv502Enablesoftcompat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.sv502Enableforcedlogoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.sv502Timesource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.sv502Acceptdownlevelapis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.sv502Lmannounce)
                }
            }
    }
}

public class ServerInfo503 internal constructor(
    public var sv503Sessopens: UInt,
    public var sv503Sessvcs: UInt,
    public var sv503Opensearch: UInt,
    public var sv503Sizreqbuf: UInt,
    public var sv503Initworkitems: UInt,
    public var sv503Maxworkitems: UInt,
    public var sv503Rawworkitems: UInt,
    public var sv503Irpstacksize: UInt,
    public var sv503Maxrawbuflen: UInt,
    public var sv503Sessusers: UInt,
    public var sv503Sessconns: UInt,
    public var sv503Maxpagedmemoryusage: UInt,
    public var sv503Maxnonpagedmemoryusage: UInt,
    public var sv503Enablesoftcompat: Bool,
    public var sv503Enableforcedlogoff: Bool,
    public var sv503Timesource: Bool,
    public var sv503Acceptdownlevelapis: Bool,
    public var sv503Lmannounce: Bool,
    sv503DomainCtorArg: Pwstr,
    public var sv503Maxcopyreadlen: UInt,
    public var sv503Maxcopywritelen: UInt,
    public var sv503Minkeepsearch: UInt,
    public var sv503Maxkeepsearch: UInt,
    public var sv503Minkeepcomplsearch: UInt,
    public var sv503Maxkeepcomplsearch: UInt,
    public var sv503Threadcountadd: UInt,
    public var sv503Numblockthreads: UInt,
    public var sv503Scavtimeout: UInt,
    public var sv503Minrcvqueue: UInt,
    public var sv503Minfreeworkitems: UInt,
    public var sv503Xactmemsize: UInt,
    public var sv503Threadpriority: UInt,
    public var sv503Maxmpxct: UInt,
    public var sv503Oplockbreakwait: UInt,
    public var sv503Oplockbreakresponsewait: UInt,
    public var sv503Enableoplocks: Bool,
    public var sv503Enableoplockforceclose: Bool,
    public var sv503Enablefcbopens: Bool,
    public var sv503Enableraw: Bool,
    public var sv503Enablesharednetdrives: Bool,
    public var sv503Minfreeconnections: UInt,
    public var sv503Maxfreeconnections: UInt,
) {
    public var sv503Domain: Pwstr = sv503DomainCtorArg
        internal set

    public constructor() : this(
        sv503Sessopens = 0u,
        sv503Sessvcs = 0u,
        sv503Opensearch = 0u,
        sv503Sizreqbuf = 0u,
        sv503Initworkitems = 0u,
        sv503Maxworkitems = 0u,
        sv503Rawworkitems = 0u,
        sv503Irpstacksize = 0u,
        sv503Maxrawbuflen = 0u,
        sv503Sessusers = 0u,
        sv503Sessconns = 0u,
        sv503Maxpagedmemoryusage = 0u,
        sv503Maxnonpagedmemoryusage = 0u,
        sv503Enablesoftcompat = 0,
        sv503Enableforcedlogoff = 0,
        sv503Timesource = 0,
        sv503Acceptdownlevelapis = 0,
        sv503Lmannounce = 0,
        sv503DomainCtorArg = MutPtr(0L),
        sv503Maxcopyreadlen = 0u,
        sv503Maxcopywritelen = 0u,
        sv503Minkeepsearch = 0u,
        sv503Maxkeepsearch = 0u,
        sv503Minkeepcomplsearch = 0u,
        sv503Maxkeepcomplsearch = 0u,
        sv503Threadcountadd = 0u,
        sv503Numblockthreads = 0u,
        sv503Scavtimeout = 0u,
        sv503Minrcvqueue = 0u,
        sv503Minfreeworkitems = 0u,
        sv503Xactmemsize = 0u,
        sv503Threadpriority = 0u,
        sv503Maxmpxct = 0u,
        sv503Oplockbreakwait = 0u,
        sv503Oplockbreakresponsewait = 0u,
        sv503Enableoplocks = 0,
        sv503Enableoplockforceclose = 0,
        sv503Enablefcbopens = 0,
        sv503Enableraw = 0,
        sv503Enablesharednetdrives = 0,
        sv503Minfreeconnections = 0u,
        sv503Maxfreeconnections = 0u,
    )

    public companion object {
        public operator fun invoke(
            sv503Sessopens: UInt = 0u,
            sv503Sessvcs: UInt = 0u,
            sv503Opensearch: UInt = 0u,
            sv503Sizreqbuf: UInt = 0u,
            sv503Initworkitems: UInt = 0u,
            sv503Maxworkitems: UInt = 0u,
            sv503Rawworkitems: UInt = 0u,
            sv503Irpstacksize: UInt = 0u,
            sv503Maxrawbuflen: UInt = 0u,
            sv503Sessusers: UInt = 0u,
            sv503Sessconns: UInt = 0u,
            sv503Maxpagedmemoryusage: UInt = 0u,
            sv503Maxnonpagedmemoryusage: UInt = 0u,
            sv503Enablesoftcompat: Bool = 0,
            sv503Enableforcedlogoff: Bool = 0,
            sv503Timesource: Bool = 0,
            sv503Acceptdownlevelapis: Bool = 0,
            sv503Lmannounce: Bool = 0,
            sv503Domain: Pwstr = MutPtr(0L),
            sv503Maxcopyreadlen: UInt = 0u,
            sv503Maxcopywritelen: UInt = 0u,
            sv503Minkeepsearch: UInt = 0u,
            sv503Maxkeepsearch: UInt = 0u,
            sv503Minkeepcomplsearch: UInt = 0u,
            sv503Maxkeepcomplsearch: UInt = 0u,
            sv503Threadcountadd: UInt = 0u,
            sv503Numblockthreads: UInt = 0u,
            sv503Scavtimeout: UInt = 0u,
            sv503Minrcvqueue: UInt = 0u,
            sv503Minfreeworkitems: UInt = 0u,
            sv503Xactmemsize: UInt = 0u,
            sv503Threadpriority: UInt = 0u,
            sv503Maxmpxct: UInt = 0u,
            sv503Oplockbreakwait: UInt = 0u,
            sv503Oplockbreakresponsewait: UInt = 0u,
            sv503Enableoplocks: Bool = 0,
            sv503Enableoplockforceclose: Bool = 0,
            sv503Enablefcbopens: Bool = 0,
            sv503Enableraw: Bool = 0,
            sv503Enablesharednetdrives: Bool = 0,
            sv503Minfreeconnections: UInt = 0u,
            sv503Maxfreeconnections: UInt = 0u,
        ): ServerInfo503 =
            ServerInfo503(
                sv503Sessopens = sv503Sessopens,
                sv503Sessvcs = sv503Sessvcs,
                sv503Opensearch = sv503Opensearch,
                sv503Sizreqbuf = sv503Sizreqbuf,
                sv503Initworkitems = sv503Initworkitems,
                sv503Maxworkitems = sv503Maxworkitems,
                sv503Rawworkitems = sv503Rawworkitems,
                sv503Irpstacksize = sv503Irpstacksize,
                sv503Maxrawbuflen = sv503Maxrawbuflen,
                sv503Sessusers = sv503Sessusers,
                sv503Sessconns = sv503Sessconns,
                sv503Maxpagedmemoryusage = sv503Maxpagedmemoryusage,
                sv503Maxnonpagedmemoryusage = sv503Maxnonpagedmemoryusage,
                sv503Enablesoftcompat = sv503Enablesoftcompat,
                sv503Enableforcedlogoff = sv503Enableforcedlogoff,
                sv503Timesource = sv503Timesource,
                sv503Acceptdownlevelapis = sv503Acceptdownlevelapis,
                sv503Lmannounce = sv503Lmannounce,
                sv503DomainCtorArg = sv503Domain,
                sv503Maxcopyreadlen = sv503Maxcopyreadlen,
                sv503Maxcopywritelen = sv503Maxcopywritelen,
                sv503Minkeepsearch = sv503Minkeepsearch,
                sv503Maxkeepsearch = sv503Maxkeepsearch,
                sv503Minkeepcomplsearch = sv503Minkeepcomplsearch,
                sv503Maxkeepcomplsearch = sv503Maxkeepcomplsearch,
                sv503Threadcountadd = sv503Threadcountadd,
                sv503Numblockthreads = sv503Numblockthreads,
                sv503Scavtimeout = sv503Scavtimeout,
                sv503Minrcvqueue = sv503Minrcvqueue,
                sv503Minfreeworkitems = sv503Minfreeworkitems,
                sv503Xactmemsize = sv503Xactmemsize,
                sv503Threadpriority = sv503Threadpriority,
                sv503Maxmpxct = sv503Maxmpxct,
                sv503Oplockbreakwait = sv503Oplockbreakwait,
                sv503Oplockbreakresponsewait = sv503Oplockbreakresponsewait,
                sv503Enableoplocks = sv503Enableoplocks,
                sv503Enableoplockforceclose = sv503Enableoplockforceclose,
                sv503Enablefcbopens = sv503Enablefcbopens,
                sv503Enableraw = sv503Enableraw,
                sv503Enablesharednetdrives = sv503Enablesharednetdrives,
                sv503Minfreeconnections = sv503Minfreeconnections,
                sv503Maxfreeconnections = sv503Maxfreeconnections,
            )
    }
}

public class ServerInfo598(
    public var sv598Maxrawworkitems: UInt = 0u,
    public var sv598Maxthreadsperqueue: UInt = 0u,
    public var sv598Producttype: UInt = 0u,
    public var sv598Serversize: UInt = 0u,
    public var sv598Connectionlessautodisc: UInt = 0u,
    public var sv598Sharingviolationretries: UInt = 0u,
    public var sv598Sharingviolationdelay: UInt = 0u,
    public var sv598Maxglobalopensearch: UInt = 0u,
    public var sv598Removeduplicatesearches: UInt = 0u,
    public var sv598Lockviolationoffset: UInt = 0u,
    public var sv598Lockviolationdelay: UInt = 0u,
    public var sv598Mdlreadswitchover: UInt = 0u,
    public var sv598Cachedopenlimit: UInt = 0u,
    public var sv598Otherqueueaffinity: UInt = 0u,
    public var sv598Restrictnullsessaccess: Bool = 0,
    public var sv598Enablewfw311directipx: Bool = 0,
    public var sv598Queuesamplesecs: UInt = 0u,
    public var sv598Balancecount: UInt = 0u,
    public var sv598Preferredaffinity: UInt = 0u,
    public var sv598Maxfreerfcbs: UInt = 0u,
    public var sv598Maxfreemfcbs: UInt = 0u,
    public var sv598Maxfreelfcbs: UInt = 0u,
    public var sv598Maxfreepagedpoolchunks: UInt = 0u,
    public var sv598Minpagedpoolchunksize: UInt = 0u,
    public var sv598Maxpagedpoolchunksize: UInt = 0u,
    public var sv598Sendsfrompreferredprocessor: Bool = 0,
    public var sv598Cacheddirectorylimit: UInt = 0u,
    public var sv598Maxcopylength: UInt = 0u,
    public var sv598Enablecompression: Bool = 0,
    public var sv598Autosharewks: Bool = 0,
    public var sv598Autoshareserver: Bool = 0,
    public var sv598Enablesecuritysignature: Bool = 0,
    public var sv598Requiresecuritysignature: Bool = 0,
    public var sv598Minclientbuffersize: UInt = 0u,
    public var sv598Serverguid: Guid = Guid(),
    public var sv598ConnectionNoSessionsTimeout: UInt = 0u,
    public var sv598IdleThreadTimeOut: UInt = 0u,
    public var sv598EnableW9xsecuritysignature: Bool = 0,
    public var sv598Enforcekerberosreauthentication: Bool = 0,
    public var sv598Disabledos: Bool = 0,
    public var sv598Lowdiskspaceminimum: UInt = 0u,
    public var sv598Disablestrictnamechecking: Bool = 0,
    public var sv598Enableauthenticateusersharing: Bool = 0,
)

public class ServerInfo599 internal constructor(
    public var sv599Sessopens: UInt,
    public var sv599Sessvcs: UInt,
    public var sv599Opensearch: UInt,
    public var sv599Sizreqbuf: UInt,
    public var sv599Initworkitems: UInt,
    public var sv599Maxworkitems: UInt,
    public var sv599Rawworkitems: UInt,
    public var sv599Irpstacksize: UInt,
    public var sv599Maxrawbuflen: UInt,
    public var sv599Sessusers: UInt,
    public var sv599Sessconns: UInt,
    public var sv599Maxpagedmemoryusage: UInt,
    public var sv599Maxnonpagedmemoryusage: UInt,
    public var sv599Enablesoftcompat: Bool,
    public var sv599Enableforcedlogoff: Bool,
    public var sv599Timesource: Bool,
    public var sv599Acceptdownlevelapis: Bool,
    public var sv599Lmannounce: Bool,
    sv599DomainCtorArg: Pwstr,
    public var sv599Maxcopyreadlen: UInt,
    public var sv599Maxcopywritelen: UInt,
    public var sv599Minkeepsearch: UInt,
    public var sv599Maxkeepsearch: UInt,
    public var sv599Minkeepcomplsearch: UInt,
    public var sv599Maxkeepcomplsearch: UInt,
    public var sv599Threadcountadd: UInt,
    public var sv599Numblockthreads: UInt,
    public var sv599Scavtimeout: UInt,
    public var sv599Minrcvqueue: UInt,
    public var sv599Minfreeworkitems: UInt,
    public var sv599Xactmemsize: UInt,
    public var sv599Threadpriority: UInt,
    public var sv599Maxmpxct: UInt,
    public var sv599Oplockbreakwait: UInt,
    public var sv599Oplockbreakresponsewait: UInt,
    public var sv599Enableoplocks: Bool,
    public var sv599Enableoplockforceclose: Bool,
    public var sv599Enablefcbopens: Bool,
    public var sv599Enableraw: Bool,
    public var sv599Enablesharednetdrives: Bool,
    public var sv599Minfreeconnections: UInt,
    public var sv599Maxfreeconnections: UInt,
    public var sv599Initsesstable: UInt,
    public var sv599Initconntable: UInt,
    public var sv599Initfiletable: UInt,
    public var sv599Initsearchtable: UInt,
    public var sv599Alertschedule: UInt,
    public var sv599Errorthreshold: UInt,
    public var sv599Networkerrorthreshold: UInt,
    public var sv599Diskspacethreshold: UInt,
    public var sv599Reserved: UInt,
    public var sv599Maxlinkdelay: UInt,
    public var sv599Minlinkthroughput: UInt,
    public var sv599Linkinfovalidtime: UInt,
    public var sv599Scavqosinfoupdatetime: UInt,
    public var sv599Maxworkitemidletime: UInt,
) {
    public var sv599Domain: Pwstr = sv599DomainCtorArg
        internal set

    public constructor() : this(
        sv599Sessopens = 0u,
        sv599Sessvcs = 0u,
        sv599Opensearch = 0u,
        sv599Sizreqbuf = 0u,
        sv599Initworkitems = 0u,
        sv599Maxworkitems = 0u,
        sv599Rawworkitems = 0u,
        sv599Irpstacksize = 0u,
        sv599Maxrawbuflen = 0u,
        sv599Sessusers = 0u,
        sv599Sessconns = 0u,
        sv599Maxpagedmemoryusage = 0u,
        sv599Maxnonpagedmemoryusage = 0u,
        sv599Enablesoftcompat = 0,
        sv599Enableforcedlogoff = 0,
        sv599Timesource = 0,
        sv599Acceptdownlevelapis = 0,
        sv599Lmannounce = 0,
        sv599DomainCtorArg = MutPtr(0L),
        sv599Maxcopyreadlen = 0u,
        sv599Maxcopywritelen = 0u,
        sv599Minkeepsearch = 0u,
        sv599Maxkeepsearch = 0u,
        sv599Minkeepcomplsearch = 0u,
        sv599Maxkeepcomplsearch = 0u,
        sv599Threadcountadd = 0u,
        sv599Numblockthreads = 0u,
        sv599Scavtimeout = 0u,
        sv599Minrcvqueue = 0u,
        sv599Minfreeworkitems = 0u,
        sv599Xactmemsize = 0u,
        sv599Threadpriority = 0u,
        sv599Maxmpxct = 0u,
        sv599Oplockbreakwait = 0u,
        sv599Oplockbreakresponsewait = 0u,
        sv599Enableoplocks = 0,
        sv599Enableoplockforceclose = 0,
        sv599Enablefcbopens = 0,
        sv599Enableraw = 0,
        sv599Enablesharednetdrives = 0,
        sv599Minfreeconnections = 0u,
        sv599Maxfreeconnections = 0u,
        sv599Initsesstable = 0u,
        sv599Initconntable = 0u,
        sv599Initfiletable = 0u,
        sv599Initsearchtable = 0u,
        sv599Alertschedule = 0u,
        sv599Errorthreshold = 0u,
        sv599Networkerrorthreshold = 0u,
        sv599Diskspacethreshold = 0u,
        sv599Reserved = 0u,
        sv599Maxlinkdelay = 0u,
        sv599Minlinkthroughput = 0u,
        sv599Linkinfovalidtime = 0u,
        sv599Scavqosinfoupdatetime = 0u,
        sv599Maxworkitemidletime = 0u,
    )

    public companion object {
        public operator fun invoke(
            sv599Sessopens: UInt = 0u,
            sv599Sessvcs: UInt = 0u,
            sv599Opensearch: UInt = 0u,
            sv599Sizreqbuf: UInt = 0u,
            sv599Initworkitems: UInt = 0u,
            sv599Maxworkitems: UInt = 0u,
            sv599Rawworkitems: UInt = 0u,
            sv599Irpstacksize: UInt = 0u,
            sv599Maxrawbuflen: UInt = 0u,
            sv599Sessusers: UInt = 0u,
            sv599Sessconns: UInt = 0u,
            sv599Maxpagedmemoryusage: UInt = 0u,
            sv599Maxnonpagedmemoryusage: UInt = 0u,
            sv599Enablesoftcompat: Bool = 0,
            sv599Enableforcedlogoff: Bool = 0,
            sv599Timesource: Bool = 0,
            sv599Acceptdownlevelapis: Bool = 0,
            sv599Lmannounce: Bool = 0,
            sv599Domain: Pwstr = MutPtr(0L),
            sv599Maxcopyreadlen: UInt = 0u,
            sv599Maxcopywritelen: UInt = 0u,
            sv599Minkeepsearch: UInt = 0u,
            sv599Maxkeepsearch: UInt = 0u,
            sv599Minkeepcomplsearch: UInt = 0u,
            sv599Maxkeepcomplsearch: UInt = 0u,
            sv599Threadcountadd: UInt = 0u,
            sv599Numblockthreads: UInt = 0u,
            sv599Scavtimeout: UInt = 0u,
            sv599Minrcvqueue: UInt = 0u,
            sv599Minfreeworkitems: UInt = 0u,
            sv599Xactmemsize: UInt = 0u,
            sv599Threadpriority: UInt = 0u,
            sv599Maxmpxct: UInt = 0u,
            sv599Oplockbreakwait: UInt = 0u,
            sv599Oplockbreakresponsewait: UInt = 0u,
            sv599Enableoplocks: Bool = 0,
            sv599Enableoplockforceclose: Bool = 0,
            sv599Enablefcbopens: Bool = 0,
            sv599Enableraw: Bool = 0,
            sv599Enablesharednetdrives: Bool = 0,
            sv599Minfreeconnections: UInt = 0u,
            sv599Maxfreeconnections: UInt = 0u,
            sv599Initsesstable: UInt = 0u,
            sv599Initconntable: UInt = 0u,
            sv599Initfiletable: UInt = 0u,
            sv599Initsearchtable: UInt = 0u,
            sv599Alertschedule: UInt = 0u,
            sv599Errorthreshold: UInt = 0u,
            sv599Networkerrorthreshold: UInt = 0u,
            sv599Diskspacethreshold: UInt = 0u,
            sv599Reserved: UInt = 0u,
            sv599Maxlinkdelay: UInt = 0u,
            sv599Minlinkthroughput: UInt = 0u,
            sv599Linkinfovalidtime: UInt = 0u,
            sv599Scavqosinfoupdatetime: UInt = 0u,
            sv599Maxworkitemidletime: UInt = 0u,
        ): ServerInfo599 =
            ServerInfo599(
                sv599Sessopens = sv599Sessopens,
                sv599Sessvcs = sv599Sessvcs,
                sv599Opensearch = sv599Opensearch,
                sv599Sizreqbuf = sv599Sizreqbuf,
                sv599Initworkitems = sv599Initworkitems,
                sv599Maxworkitems = sv599Maxworkitems,
                sv599Rawworkitems = sv599Rawworkitems,
                sv599Irpstacksize = sv599Irpstacksize,
                sv599Maxrawbuflen = sv599Maxrawbuflen,
                sv599Sessusers = sv599Sessusers,
                sv599Sessconns = sv599Sessconns,
                sv599Maxpagedmemoryusage = sv599Maxpagedmemoryusage,
                sv599Maxnonpagedmemoryusage = sv599Maxnonpagedmemoryusage,
                sv599Enablesoftcompat = sv599Enablesoftcompat,
                sv599Enableforcedlogoff = sv599Enableforcedlogoff,
                sv599Timesource = sv599Timesource,
                sv599Acceptdownlevelapis = sv599Acceptdownlevelapis,
                sv599Lmannounce = sv599Lmannounce,
                sv599DomainCtorArg = sv599Domain,
                sv599Maxcopyreadlen = sv599Maxcopyreadlen,
                sv599Maxcopywritelen = sv599Maxcopywritelen,
                sv599Minkeepsearch = sv599Minkeepsearch,
                sv599Maxkeepsearch = sv599Maxkeepsearch,
                sv599Minkeepcomplsearch = sv599Minkeepcomplsearch,
                sv599Maxkeepcomplsearch = sv599Maxkeepcomplsearch,
                sv599Threadcountadd = sv599Threadcountadd,
                sv599Numblockthreads = sv599Numblockthreads,
                sv599Scavtimeout = sv599Scavtimeout,
                sv599Minrcvqueue = sv599Minrcvqueue,
                sv599Minfreeworkitems = sv599Minfreeworkitems,
                sv599Xactmemsize = sv599Xactmemsize,
                sv599Threadpriority = sv599Threadpriority,
                sv599Maxmpxct = sv599Maxmpxct,
                sv599Oplockbreakwait = sv599Oplockbreakwait,
                sv599Oplockbreakresponsewait = sv599Oplockbreakresponsewait,
                sv599Enableoplocks = sv599Enableoplocks,
                sv599Enableoplockforceclose = sv599Enableoplockforceclose,
                sv599Enablefcbopens = sv599Enablefcbopens,
                sv599Enableraw = sv599Enableraw,
                sv599Enablesharednetdrives = sv599Enablesharednetdrives,
                sv599Minfreeconnections = sv599Minfreeconnections,
                sv599Maxfreeconnections = sv599Maxfreeconnections,
                sv599Initsesstable = sv599Initsesstable,
                sv599Initconntable = sv599Initconntable,
                sv599Initfiletable = sv599Initfiletable,
                sv599Initsearchtable = sv599Initsearchtable,
                sv599Alertschedule = sv599Alertschedule,
                sv599Errorthreshold = sv599Errorthreshold,
                sv599Networkerrorthreshold = sv599Networkerrorthreshold,
                sv599Diskspacethreshold = sv599Diskspacethreshold,
                sv599Reserved = sv599Reserved,
                sv599Maxlinkdelay = sv599Maxlinkdelay,
                sv599Minlinkthroughput = sv599Minlinkthroughput,
                sv599Linkinfovalidtime = sv599Linkinfovalidtime,
                sv599Scavqosinfoupdatetime = sv599Scavqosinfoupdatetime,
                sv599Maxworkitemidletime = sv599Maxworkitemidletime,
            )
    }
}

public class ServerTransportInfo0 internal constructor(
    public var svti0Numberofvcs: UInt,
    svti0TransportnameCtorArg: Pwstr,
    svti0TransportaddressCtorArg: MutPtr,
    public var svti0Transportaddresslength: UInt,
    svti0NetworkaddressCtorArg: Pwstr,
) {
    public var svti0Transportname: Pwstr = svti0TransportnameCtorArg
        internal set

    public var svti0Transportaddress: MutPtr = svti0TransportaddressCtorArg
        internal set

    public var svti0Networkaddress: Pwstr = svti0NetworkaddressCtorArg
        internal set

    public constructor() : this(
        svti0Numberofvcs = 0u,
        svti0TransportnameCtorArg = MutPtr(0L),
        svti0TransportaddressCtorArg = MutPtr(0L),
        svti0Transportaddresslength = 0u,
        svti0NetworkaddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.svti0Numberofvcs

    public operator fun component2(): Pwstr = this.svti0Transportname

    public operator fun component3(): MutPtr = this.svti0Transportaddress

    public operator fun component4(): UInt = this.svti0Transportaddresslength

    public operator fun component5(): Pwstr = this.svti0Networkaddress

    public fun copy(svti0Numberofvcs: UInt = this.svti0Numberofvcs, svti0Transportname: Pwstr = this.svti0Transportname, svti0Transportaddress: MutPtr = this.svti0Transportaddress, svti0Transportaddresslength: UInt = this.svti0Transportaddresslength, svti0Networkaddress: Pwstr = this.svti0Networkaddress): ServerTransportInfo0 = ServerTransportInfo0(svti0Numberofvcs = svti0Numberofvcs, svti0TransportnameCtorArg = svti0Transportname, svti0TransportaddressCtorArg = svti0Transportaddress, svti0Transportaddresslength = svti0Transportaddresslength, svti0NetworkaddressCtorArg = svti0Networkaddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerTransportInfo0) return false
        if (this.svti0Numberofvcs != other.svti0Numberofvcs) return false
        if (this.svti0Transportname != other.svti0Transportname) return false
        if (this.svti0Transportaddress != other.svti0Transportaddress) return false
        if (this.svti0Transportaddresslength != other.svti0Transportaddresslength) return false
        if (this.svti0Networkaddress != other.svti0Networkaddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti0Numberofvcs.hashCode()
        result = 31 * result + this.svti0Transportname.hashCode()
        result = 31 * result + this.svti0Transportaddress.hashCode()
        result = 31 * result + this.svti0Transportaddresslength.hashCode()
        result = 31 * result + this.svti0Networkaddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svti0Numberofvcs: UInt = 0u,
            svti0Transportname: Pwstr = MutPtr(0L),
            svti0Transportaddress: MutPtr = MutPtr(0L),
            svti0Transportaddresslength: UInt = 0u,
            svti0Networkaddress: Pwstr = MutPtr(0L),
        ): ServerTransportInfo0 =
            ServerTransportInfo0(
                svti0Numberofvcs = svti0Numberofvcs,
                svti0TransportnameCtorArg = svti0Transportname,
                svti0TransportaddressCtorArg = svti0Transportaddress,
                svti0Transportaddresslength = svti0Transportaddresslength,
                svti0NetworkaddressCtorArg = svti0Networkaddress,
            )
    }
}

public class ServerTransportInfo1 internal constructor(
    public var svti1Numberofvcs: UInt,
    svti1TransportnameCtorArg: Pwstr,
    svti1TransportaddressCtorArg: MutPtr,
    public var svti1Transportaddresslength: UInt,
    svti1NetworkaddressCtorArg: Pwstr,
    svti1DomainCtorArg: Pwstr,
) {
    public var svti1Transportname: Pwstr = svti1TransportnameCtorArg
        internal set

    public var svti1Transportaddress: MutPtr = svti1TransportaddressCtorArg
        internal set

    public var svti1Networkaddress: Pwstr = svti1NetworkaddressCtorArg
        internal set

    public var svti1Domain: Pwstr = svti1DomainCtorArg
        internal set

    public constructor() : this(
        svti1Numberofvcs = 0u,
        svti1TransportnameCtorArg = MutPtr(0L),
        svti1TransportaddressCtorArg = MutPtr(0L),
        svti1Transportaddresslength = 0u,
        svti1NetworkaddressCtorArg = MutPtr(0L),
        svti1DomainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.svti1Numberofvcs

    public operator fun component2(): Pwstr = this.svti1Transportname

    public operator fun component3(): MutPtr = this.svti1Transportaddress

    public operator fun component4(): UInt = this.svti1Transportaddresslength

    public operator fun component5(): Pwstr = this.svti1Networkaddress

    public operator fun component6(): Pwstr = this.svti1Domain

    public fun copy(svti1Numberofvcs: UInt = this.svti1Numberofvcs, svti1Transportname: Pwstr = this.svti1Transportname, svti1Transportaddress: MutPtr = this.svti1Transportaddress, svti1Transportaddresslength: UInt = this.svti1Transportaddresslength, svti1Networkaddress: Pwstr = this.svti1Networkaddress, svti1Domain: Pwstr = this.svti1Domain): ServerTransportInfo1 = ServerTransportInfo1(svti1Numberofvcs = svti1Numberofvcs, svti1TransportnameCtorArg = svti1Transportname, svti1TransportaddressCtorArg = svti1Transportaddress, svti1Transportaddresslength = svti1Transportaddresslength, svti1NetworkaddressCtorArg = svti1Networkaddress, svti1DomainCtorArg = svti1Domain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerTransportInfo1) return false
        if (this.svti1Numberofvcs != other.svti1Numberofvcs) return false
        if (this.svti1Transportname != other.svti1Transportname) return false
        if (this.svti1Transportaddress != other.svti1Transportaddress) return false
        if (this.svti1Transportaddresslength != other.svti1Transportaddresslength) return false
        if (this.svti1Networkaddress != other.svti1Networkaddress) return false
        if (this.svti1Domain != other.svti1Domain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti1Numberofvcs.hashCode()
        result = 31 * result + this.svti1Transportname.hashCode()
        result = 31 * result + this.svti1Transportaddress.hashCode()
        result = 31 * result + this.svti1Transportaddresslength.hashCode()
        result = 31 * result + this.svti1Networkaddress.hashCode()
        result = 31 * result + this.svti1Domain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svti1Numberofvcs: UInt = 0u,
            svti1Transportname: Pwstr = MutPtr(0L),
            svti1Transportaddress: MutPtr = MutPtr(0L),
            svti1Transportaddresslength: UInt = 0u,
            svti1Networkaddress: Pwstr = MutPtr(0L),
            svti1Domain: Pwstr = MutPtr(0L),
        ): ServerTransportInfo1 =
            ServerTransportInfo1(
                svti1Numberofvcs = svti1Numberofvcs,
                svti1TransportnameCtorArg = svti1Transportname,
                svti1TransportaddressCtorArg = svti1Transportaddress,
                svti1Transportaddresslength = svti1Transportaddresslength,
                svti1NetworkaddressCtorArg = svti1Networkaddress,
                svti1DomainCtorArg = svti1Domain,
            )
    }
}

public class ServerTransportInfo2 internal constructor(
    public var svti2Numberofvcs: UInt,
    svti2TransportnameCtorArg: Pwstr,
    svti2TransportaddressCtorArg: MutPtr,
    public var svti2Transportaddresslength: UInt,
    svti2NetworkaddressCtorArg: Pwstr,
    svti2DomainCtorArg: Pwstr,
    public var svti2Flags: UInt,
) {
    public var svti2Transportname: Pwstr = svti2TransportnameCtorArg
        internal set

    public var svti2Transportaddress: MutPtr = svti2TransportaddressCtorArg
        internal set

    public var svti2Networkaddress: Pwstr = svti2NetworkaddressCtorArg
        internal set

    public var svti2Domain: Pwstr = svti2DomainCtorArg
        internal set

    public constructor() : this(
        svti2Numberofvcs = 0u,
        svti2TransportnameCtorArg = MutPtr(0L),
        svti2TransportaddressCtorArg = MutPtr(0L),
        svti2Transportaddresslength = 0u,
        svti2NetworkaddressCtorArg = MutPtr(0L),
        svti2DomainCtorArg = MutPtr(0L),
        svti2Flags = 0u,
    )

    public operator fun component1(): UInt = this.svti2Numberofvcs

    public operator fun component2(): Pwstr = this.svti2Transportname

    public operator fun component3(): MutPtr = this.svti2Transportaddress

    public operator fun component4(): UInt = this.svti2Transportaddresslength

    public operator fun component5(): Pwstr = this.svti2Networkaddress

    public operator fun component6(): Pwstr = this.svti2Domain

    public operator fun component7(): UInt = this.svti2Flags

    public fun copy(svti2Numberofvcs: UInt = this.svti2Numberofvcs, svti2Transportname: Pwstr = this.svti2Transportname, svti2Transportaddress: MutPtr = this.svti2Transportaddress, svti2Transportaddresslength: UInt = this.svti2Transportaddresslength, svti2Networkaddress: Pwstr = this.svti2Networkaddress, svti2Domain: Pwstr = this.svti2Domain, svti2Flags: UInt = this.svti2Flags): ServerTransportInfo2 = ServerTransportInfo2(svti2Numberofvcs = svti2Numberofvcs, svti2TransportnameCtorArg = svti2Transportname, svti2TransportaddressCtorArg = svti2Transportaddress, svti2Transportaddresslength = svti2Transportaddresslength, svti2NetworkaddressCtorArg = svti2Networkaddress, svti2DomainCtorArg = svti2Domain, svti2Flags = svti2Flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerTransportInfo2) return false
        if (this.svti2Numberofvcs != other.svti2Numberofvcs) return false
        if (this.svti2Transportname != other.svti2Transportname) return false
        if (this.svti2Transportaddress != other.svti2Transportaddress) return false
        if (this.svti2Transportaddresslength != other.svti2Transportaddresslength) return false
        if (this.svti2Networkaddress != other.svti2Networkaddress) return false
        if (this.svti2Domain != other.svti2Domain) return false
        if (this.svti2Flags != other.svti2Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti2Numberofvcs.hashCode()
        result = 31 * result + this.svti2Transportname.hashCode()
        result = 31 * result + this.svti2Transportaddress.hashCode()
        result = 31 * result + this.svti2Transportaddresslength.hashCode()
        result = 31 * result + this.svti2Networkaddress.hashCode()
        result = 31 * result + this.svti2Domain.hashCode()
        result = 31 * result + this.svti2Flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svti2Numberofvcs: UInt = 0u,
            svti2Transportname: Pwstr = MutPtr(0L),
            svti2Transportaddress: MutPtr = MutPtr(0L),
            svti2Transportaddresslength: UInt = 0u,
            svti2Networkaddress: Pwstr = MutPtr(0L),
            svti2Domain: Pwstr = MutPtr(0L),
            svti2Flags: UInt = 0u,
        ): ServerTransportInfo2 =
            ServerTransportInfo2(
                svti2Numberofvcs = svti2Numberofvcs,
                svti2TransportnameCtorArg = svti2Transportname,
                svti2TransportaddressCtorArg = svti2Transportaddress,
                svti2Transportaddresslength = svti2Transportaddresslength,
                svti2NetworkaddressCtorArg = svti2Networkaddress,
                svti2DomainCtorArg = svti2Domain,
                svti2Flags = svti2Flags,
            )
    }
}

public class ServerTransportInfo3 internal constructor(
    public var svti3Numberofvcs: UInt,
    svti3TransportnameCtorArg: Pwstr,
    svti3TransportaddressCtorArg: MutPtr,
    public var svti3Transportaddresslength: UInt,
    svti3NetworkaddressCtorArg: Pwstr,
    svti3DomainCtorArg: Pwstr,
    public var svti3Flags: UInt,
    public var svti3Passwordlength: UInt,
    public var svti3Password: UByteArray,
) {
    public var svti3Transportname: Pwstr = svti3TransportnameCtorArg
        internal set

    public var svti3Transportaddress: MutPtr = svti3TransportaddressCtorArg
        internal set

    public var svti3Networkaddress: Pwstr = svti3NetworkaddressCtorArg
        internal set

    public var svti3Domain: Pwstr = svti3DomainCtorArg
        internal set

    public constructor() : this(
        svti3Numberofvcs = 0u,
        svti3TransportnameCtorArg = MutPtr(0L),
        svti3TransportaddressCtorArg = MutPtr(0L),
        svti3Transportaddresslength = 0u,
        svti3NetworkaddressCtorArg = MutPtr(0L),
        svti3DomainCtorArg = MutPtr(0L),
        svti3Flags = 0u,
        svti3Passwordlength = 0u,
        svti3Password = UByteArray(256),
    )

    public operator fun component1(): UInt = this.svti3Numberofvcs

    public operator fun component2(): Pwstr = this.svti3Transportname

    public operator fun component3(): MutPtr = this.svti3Transportaddress

    public operator fun component4(): UInt = this.svti3Transportaddresslength

    public operator fun component5(): Pwstr = this.svti3Networkaddress

    public operator fun component6(): Pwstr = this.svti3Domain

    public operator fun component7(): UInt = this.svti3Flags

    public operator fun component8(): UInt = this.svti3Passwordlength

    public operator fun component9(): UByteArray = this.svti3Password

    public fun copy(svti3Numberofvcs: UInt = this.svti3Numberofvcs, svti3Transportname: Pwstr = this.svti3Transportname, svti3Transportaddress: MutPtr = this.svti3Transportaddress, svti3Transportaddresslength: UInt = this.svti3Transportaddresslength, svti3Networkaddress: Pwstr = this.svti3Networkaddress, svti3Domain: Pwstr = this.svti3Domain, svti3Flags: UInt = this.svti3Flags, svti3Passwordlength: UInt = this.svti3Passwordlength, svti3Password: UByteArray = this.svti3Password): ServerTransportInfo3 = ServerTransportInfo3(svti3Numberofvcs = svti3Numberofvcs, svti3TransportnameCtorArg = svti3Transportname, svti3TransportaddressCtorArg = svti3Transportaddress, svti3Transportaddresslength = svti3Transportaddresslength, svti3NetworkaddressCtorArg = svti3Networkaddress, svti3DomainCtorArg = svti3Domain, svti3Flags = svti3Flags, svti3Passwordlength = svti3Passwordlength, svti3Password = svti3Password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerTransportInfo3) return false
        if (this.svti3Numberofvcs != other.svti3Numberofvcs) return false
        if (this.svti3Transportname != other.svti3Transportname) return false
        if (this.svti3Transportaddress != other.svti3Transportaddress) return false
        if (this.svti3Transportaddresslength != other.svti3Transportaddresslength) return false
        if (this.svti3Networkaddress != other.svti3Networkaddress) return false
        if (this.svti3Domain != other.svti3Domain) return false
        if (this.svti3Flags != other.svti3Flags) return false
        if (this.svti3Passwordlength != other.svti3Passwordlength) return false
        if (!this.svti3Password.contentEquals(other.svti3Password)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti3Numberofvcs.hashCode()
        result = 31 * result + this.svti3Transportname.hashCode()
        result = 31 * result + this.svti3Transportaddress.hashCode()
        result = 31 * result + this.svti3Transportaddresslength.hashCode()
        result = 31 * result + this.svti3Networkaddress.hashCode()
        result = 31 * result + this.svti3Domain.hashCode()
        result = 31 * result + this.svti3Flags.hashCode()
        result = 31 * result + this.svti3Passwordlength.hashCode()
        result = 31 * result + this.svti3Password.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svti3Numberofvcs: UInt = 0u,
            svti3Transportname: Pwstr = MutPtr(0L),
            svti3Transportaddress: MutPtr = MutPtr(0L),
            svti3Transportaddresslength: UInt = 0u,
            svti3Networkaddress: Pwstr = MutPtr(0L),
            svti3Domain: Pwstr = MutPtr(0L),
            svti3Flags: UInt = 0u,
            svti3Passwordlength: UInt = 0u,
            svti3Password: UByteArray = UByteArray(256),
        ): ServerTransportInfo3 =
            ServerTransportInfo3(
                svti3Numberofvcs = svti3Numberofvcs,
                svti3TransportnameCtorArg = svti3Transportname,
                svti3TransportaddressCtorArg = svti3Transportaddress,
                svti3Transportaddresslength = svti3Transportaddresslength,
                svti3NetworkaddressCtorArg = svti3Networkaddress,
                svti3DomainCtorArg = svti3Domain,
                svti3Flags = svti3Flags,
                svti3Passwordlength = svti3Passwordlength,
                svti3Password = svti3Password,
            )
    }
}

public class ServiceInfo0 internal constructor(
    svci0NameCtorArg: Pwstr,
) {
    public var svci0Name: Pwstr = svci0NameCtorArg
        internal set

    public constructor() : this(
        svci0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.svci0Name

    public fun copy(svci0Name: Pwstr = this.svci0Name): ServiceInfo0 = ServiceInfo0(svci0NameCtorArg = svci0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceInfo0) return false
        if (this.svci0Name != other.svci0Name) return false
        return true
    }

    override fun hashCode(): Int = this.svci0Name.hashCode()

    public companion object {
        public operator fun invoke(
            svci0Name: Pwstr = MutPtr(0L),
        ): ServiceInfo0 =
            ServiceInfo0(
                svci0NameCtorArg = svci0Name,
            )
    }
}

public class ServiceInfo1 internal constructor(
    svci1NameCtorArg: Pwstr,
    public var svci1Status: UInt,
    public var svci1Code: UInt,
    public var svci1Pid: UInt,
) {
    public var svci1Name: Pwstr = svci1NameCtorArg
        internal set

    public constructor() : this(
        svci1NameCtorArg = MutPtr(0L),
        svci1Status = 0u,
        svci1Code = 0u,
        svci1Pid = 0u,
    )

    public operator fun component1(): Pwstr = this.svci1Name

    public operator fun component2(): UInt = this.svci1Status

    public operator fun component3(): UInt = this.svci1Code

    public operator fun component4(): UInt = this.svci1Pid

    public fun copy(svci1Name: Pwstr = this.svci1Name, svci1Status: UInt = this.svci1Status, svci1Code: UInt = this.svci1Code, svci1Pid: UInt = this.svci1Pid): ServiceInfo1 = ServiceInfo1(svci1NameCtorArg = svci1Name, svci1Status = svci1Status, svci1Code = svci1Code, svci1Pid = svci1Pid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceInfo1) return false
        if (this.svci1Name != other.svci1Name) return false
        if (this.svci1Status != other.svci1Status) return false
        if (this.svci1Code != other.svci1Code) return false
        if (this.svci1Pid != other.svci1Pid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svci1Name.hashCode()
        result = 31 * result + this.svci1Status.hashCode()
        result = 31 * result + this.svci1Code.hashCode()
        result = 31 * result + this.svci1Pid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svci1Name: Pwstr = MutPtr(0L),
            svci1Status: UInt = 0u,
            svci1Code: UInt = 0u,
            svci1Pid: UInt = 0u,
        ): ServiceInfo1 =
            ServiceInfo1(
                svci1NameCtorArg = svci1Name,
                svci1Status = svci1Status,
                svci1Code = svci1Code,
                svci1Pid = svci1Pid,
            )
    }
}

public class ServiceInfo2 internal constructor(
    svci2NameCtorArg: Pwstr,
    public var svci2Status: UInt,
    public var svci2Code: UInt,
    public var svci2Pid: UInt,
    svci2TextCtorArg: Pwstr,
    public var svci2SpecificError: UInt,
    svci2DisplayNameCtorArg: Pwstr,
) {
    public var svci2Name: Pwstr = svci2NameCtorArg
        internal set

    public var svci2Text: Pwstr = svci2TextCtorArg
        internal set

    public var svci2DisplayName: Pwstr = svci2DisplayNameCtorArg
        internal set

    public constructor() : this(
        svci2NameCtorArg = MutPtr(0L),
        svci2Status = 0u,
        svci2Code = 0u,
        svci2Pid = 0u,
        svci2TextCtorArg = MutPtr(0L),
        svci2SpecificError = 0u,
        svci2DisplayNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.svci2Name

    public operator fun component2(): UInt = this.svci2Status

    public operator fun component3(): UInt = this.svci2Code

    public operator fun component4(): UInt = this.svci2Pid

    public operator fun component5(): Pwstr = this.svci2Text

    public operator fun component6(): UInt = this.svci2SpecificError

    public operator fun component7(): Pwstr = this.svci2DisplayName

    public fun copy(svci2Name: Pwstr = this.svci2Name, svci2Status: UInt = this.svci2Status, svci2Code: UInt = this.svci2Code, svci2Pid: UInt = this.svci2Pid, svci2Text: Pwstr = this.svci2Text, svci2SpecificError: UInt = this.svci2SpecificError, svci2DisplayName: Pwstr = this.svci2DisplayName): ServiceInfo2 = ServiceInfo2(svci2NameCtorArg = svci2Name, svci2Status = svci2Status, svci2Code = svci2Code, svci2Pid = svci2Pid, svci2TextCtorArg = svci2Text, svci2SpecificError = svci2SpecificError, svci2DisplayNameCtorArg = svci2DisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceInfo2) return false
        if (this.svci2Name != other.svci2Name) return false
        if (this.svci2Status != other.svci2Status) return false
        if (this.svci2Code != other.svci2Code) return false
        if (this.svci2Pid != other.svci2Pid) return false
        if (this.svci2Text != other.svci2Text) return false
        if (this.svci2SpecificError != other.svci2SpecificError) return false
        if (this.svci2DisplayName != other.svci2DisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svci2Name.hashCode()
        result = 31 * result + this.svci2Status.hashCode()
        result = 31 * result + this.svci2Code.hashCode()
        result = 31 * result + this.svci2Pid.hashCode()
        result = 31 * result + this.svci2Text.hashCode()
        result = 31 * result + this.svci2SpecificError.hashCode()
        result = 31 * result + this.svci2DisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            svci2Name: Pwstr = MutPtr(0L),
            svci2Status: UInt = 0u,
            svci2Code: UInt = 0u,
            svci2Pid: UInt = 0u,
            svci2Text: Pwstr = MutPtr(0L),
            svci2SpecificError: UInt = 0u,
            svci2DisplayName: Pwstr = MutPtr(0L),
        ): ServiceInfo2 =
            ServiceInfo2(
                svci2NameCtorArg = svci2Name,
                svci2Status = svci2Status,
                svci2Code = svci2Code,
                svci2Pid = svci2Pid,
                svci2TextCtorArg = svci2Text,
                svci2SpecificError = svci2SpecificError,
                svci2DisplayNameCtorArg = svci2DisplayName,
            )
    }
}

public data class SmbCompressionInfo(
    public var switch: Boolean = false,
    public var reserved1: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var reserved3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbCompressionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbCompressionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SmbCompressionInfo =
                    SmbCompressionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SmbCompressionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.switch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved3)
                }
            }
    }
}

public data class SmbTreeConnectParameters(
    public var eABufferOffset: UInt = 0u,
    public var eABufferLen: UInt = 0u,
    public var createOptions: UInt = 0u,
    public var treeConnectAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbTreeConnectParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbTreeConnectParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SmbTreeConnectParameters =
                    SmbTreeConnectParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SmbTreeConnectParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eABufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eABufferLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.createOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.treeConnectAttributes)
                }
            }
    }
}

public data class SmbUseOptionCompressionParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbUseOptionCompressionParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbUseOptionCompressionParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SmbUseOptionCompressionParameters =
                    SmbUseOptionCompressionParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SmbUseOptionCompressionParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class StdAlert(
    public var alrtTimestamp: UInt = 0u,
    public var alrtEventname: UShortArray = UShortArray(17),
    public var alrtServicename: UShortArray = UShortArray(81),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StdAlert) return false
        if (this.alrtTimestamp != other.alrtTimestamp) return false
        if (!this.alrtEventname.contentEquals(other.alrtEventname)) return false
        if (!this.alrtServicename.contentEquals(other.alrtServicename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alrtTimestamp.hashCode()
        result = 31 * result + this.alrtEventname.contentHashCode()
        result = 31 * result + this.alrtServicename.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StdAlert> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StdAlert> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 200L
                override fun readNative(addr: Long): StdAlert =
                    StdAlert(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (81).toInt())
                        ).readNative(addr + 38L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: StdAlert) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alrtTimestamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 4L, value.alrtEventname.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (81).toInt())
                    ).writeNative(addr + 38L, value.alrtServicename.toList())
                }
            }
    }
}

public data class TimeOfDayInfo(
    public var todElapsedt: UInt = 0u,
    public var todMsecs: UInt = 0u,
    public var todHours: UInt = 0u,
    public var todMins: UInt = 0u,
    public var todSecs: UInt = 0u,
    public var todHunds: UInt = 0u,
    public var todTimezone: Int = 0,
    public var todTinterval: UInt = 0u,
    public var todDay: UInt = 0u,
    public var todMonth: UInt = 0u,
    public var todYear: UInt = 0u,
    public var todWeekday: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeOfDayInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeOfDayInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): TimeOfDayInfo =
                    TimeOfDayInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: TimeOfDayInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.todElapsedt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.todMsecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.todHours)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.todMins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.todSecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.todHunds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.todTimezone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.todTinterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.todDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.todMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.todYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.todWeekday)
                }
            }
    }
}

public data class TransportInfo(
    public var type: TransportType = 0,
    public var skipCertificateCheck: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TransportInfo =
                    TransportInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TransportInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.skipCertificateCheck)
                }
            }
    }
}

public class UserInfo0 internal constructor(
    usri0NameCtorArg: Pwstr,
) {
    public var usri0Name: Pwstr = usri0NameCtorArg
        internal set

    public constructor() : this(
        usri0NameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri0Name

    public fun copy(usri0Name: Pwstr = this.usri0Name): UserInfo0 = UserInfo0(usri0NameCtorArg = usri0Name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo0) return false
        if (this.usri0Name != other.usri0Name) return false
        return true
    }

    override fun hashCode(): Int = this.usri0Name.hashCode()

    public companion object {
        public operator fun invoke(
            usri0Name: Pwstr = MutPtr(0L),
        ): UserInfo0 =
            UserInfo0(
                usri0NameCtorArg = usri0Name,
            )
    }
}

public class UserInfo1 internal constructor(
    usri1NameCtorArg: Pwstr,
    usri1PasswordCtorArg: Pwstr,
    public var usri1PasswordAge: UInt,
    public var usri1Priv: UserPriv,
    usri1HomeDirCtorArg: Pwstr,
    usri1CommentCtorArg: Pwstr,
    public var usri1Flags: UserAccountFlags,
    usri1ScriptPathCtorArg: Pwstr,
) {
    public var usri1Name: Pwstr = usri1NameCtorArg
        internal set

    public var usri1Password: Pwstr = usri1PasswordCtorArg
        internal set

    public var usri1HomeDir: Pwstr = usri1HomeDirCtorArg
        internal set

    public var usri1Comment: Pwstr = usri1CommentCtorArg
        internal set

    public var usri1ScriptPath: Pwstr = usri1ScriptPathCtorArg
        internal set

    public constructor() : this(
        usri1NameCtorArg = MutPtr(0L),
        usri1PasswordCtorArg = MutPtr(0L),
        usri1PasswordAge = 0u,
        usri1Priv = 0u,
        usri1HomeDirCtorArg = MutPtr(0L),
        usri1CommentCtorArg = MutPtr(0L),
        usri1Flags = 0u,
        usri1ScriptPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1Name

    public operator fun component2(): Pwstr = this.usri1Password

    public operator fun component3(): UInt = this.usri1PasswordAge

    public operator fun component4(): UserPriv = this.usri1Priv

    public operator fun component5(): Pwstr = this.usri1HomeDir

    public operator fun component6(): Pwstr = this.usri1Comment

    public operator fun component7(): UserAccountFlags = this.usri1Flags

    public operator fun component8(): Pwstr = this.usri1ScriptPath

    public fun copy(usri1Name: Pwstr = this.usri1Name, usri1Password: Pwstr = this.usri1Password, usri1PasswordAge: UInt = this.usri1PasswordAge, usri1Priv: UserPriv = this.usri1Priv, usri1HomeDir: Pwstr = this.usri1HomeDir, usri1Comment: Pwstr = this.usri1Comment, usri1Flags: UserAccountFlags = this.usri1Flags, usri1ScriptPath: Pwstr = this.usri1ScriptPath): UserInfo1 = UserInfo1(usri1NameCtorArg = usri1Name, usri1PasswordCtorArg = usri1Password, usri1PasswordAge = usri1PasswordAge, usri1Priv = usri1Priv, usri1HomeDirCtorArg = usri1HomeDir, usri1CommentCtorArg = usri1Comment, usri1Flags = usri1Flags, usri1ScriptPathCtorArg = usri1ScriptPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1) return false
        if (this.usri1Name != other.usri1Name) return false
        if (this.usri1Password != other.usri1Password) return false
        if (this.usri1PasswordAge != other.usri1PasswordAge) return false
        if (this.usri1Priv != other.usri1Priv) return false
        if (this.usri1HomeDir != other.usri1HomeDir) return false
        if (this.usri1Comment != other.usri1Comment) return false
        if (this.usri1Flags != other.usri1Flags) return false
        if (this.usri1ScriptPath != other.usri1ScriptPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri1Name.hashCode()
        result = 31 * result + this.usri1Password.hashCode()
        result = 31 * result + this.usri1PasswordAge.hashCode()
        result = 31 * result + this.usri1Priv.hashCode()
        result = 31 * result + this.usri1HomeDir.hashCode()
        result = 31 * result + this.usri1Comment.hashCode()
        result = 31 * result + this.usri1Flags.hashCode()
        result = 31 * result + this.usri1ScriptPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri1Name: Pwstr = MutPtr(0L),
            usri1Password: Pwstr = MutPtr(0L),
            usri1PasswordAge: UInt = 0u,
            usri1Priv: UserPriv = 0u,
            usri1HomeDir: Pwstr = MutPtr(0L),
            usri1Comment: Pwstr = MutPtr(0L),
            usri1Flags: UserAccountFlags = 0u,
            usri1ScriptPath: Pwstr = MutPtr(0L),
        ): UserInfo1 =
            UserInfo1(
                usri1NameCtorArg = usri1Name,
                usri1PasswordCtorArg = usri1Password,
                usri1PasswordAge = usri1PasswordAge,
                usri1Priv = usri1Priv,
                usri1HomeDirCtorArg = usri1HomeDir,
                usri1CommentCtorArg = usri1Comment,
                usri1Flags = usri1Flags,
                usri1ScriptPathCtorArg = usri1ScriptPath,
            )
    }
}

public class UserInfo10 internal constructor(
    usri10NameCtorArg: Pwstr,
    usri10CommentCtorArg: Pwstr,
    usri10UsrCommentCtorArg: Pwstr,
    usri10FullNameCtorArg: Pwstr,
) {
    public var usri10Name: Pwstr = usri10NameCtorArg
        internal set

    public var usri10Comment: Pwstr = usri10CommentCtorArg
        internal set

    public var usri10UsrComment: Pwstr = usri10UsrCommentCtorArg
        internal set

    public var usri10FullName: Pwstr = usri10FullNameCtorArg
        internal set

    public constructor() : this(
        usri10NameCtorArg = MutPtr(0L),
        usri10CommentCtorArg = MutPtr(0L),
        usri10UsrCommentCtorArg = MutPtr(0L),
        usri10FullNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri10Name

    public operator fun component2(): Pwstr = this.usri10Comment

    public operator fun component3(): Pwstr = this.usri10UsrComment

    public operator fun component4(): Pwstr = this.usri10FullName

    public fun copy(usri10Name: Pwstr = this.usri10Name, usri10Comment: Pwstr = this.usri10Comment, usri10UsrComment: Pwstr = this.usri10UsrComment, usri10FullName: Pwstr = this.usri10FullName): UserInfo10 = UserInfo10(usri10NameCtorArg = usri10Name, usri10CommentCtorArg = usri10Comment, usri10UsrCommentCtorArg = usri10UsrComment, usri10FullNameCtorArg = usri10FullName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo10) return false
        if (this.usri10Name != other.usri10Name) return false
        if (this.usri10Comment != other.usri10Comment) return false
        if (this.usri10UsrComment != other.usri10UsrComment) return false
        if (this.usri10FullName != other.usri10FullName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri10Name.hashCode()
        result = 31 * result + this.usri10Comment.hashCode()
        result = 31 * result + this.usri10UsrComment.hashCode()
        result = 31 * result + this.usri10FullName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri10Name: Pwstr = MutPtr(0L),
            usri10Comment: Pwstr = MutPtr(0L),
            usri10UsrComment: Pwstr = MutPtr(0L),
            usri10FullName: Pwstr = MutPtr(0L),
        ): UserInfo10 =
            UserInfo10(
                usri10NameCtorArg = usri10Name,
                usri10CommentCtorArg = usri10Comment,
                usri10UsrCommentCtorArg = usri10UsrComment,
                usri10FullNameCtorArg = usri10FullName,
            )
    }
}

public class UserInfo1003 internal constructor(
    usri1003PasswordCtorArg: Pwstr,
) {
    public var usri1003Password: Pwstr = usri1003PasswordCtorArg
        internal set

    public constructor() : this(
        usri1003PasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1003Password

    public fun copy(usri1003Password: Pwstr = this.usri1003Password): UserInfo1003 = UserInfo1003(usri1003PasswordCtorArg = usri1003Password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1003) return false
        if (this.usri1003Password != other.usri1003Password) return false
        return true
    }

    override fun hashCode(): Int = this.usri1003Password.hashCode()

    public companion object {
        public operator fun invoke(
            usri1003Password: Pwstr = MutPtr(0L),
        ): UserInfo1003 =
            UserInfo1003(
                usri1003PasswordCtorArg = usri1003Password,
            )
    }
}

public data class UserInfo1005(
    public var usri1005Priv: UserPriv = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1005> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1005> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1005 =
                    UserInfo1005(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1005) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1005Priv)
                }
            }
    }
}

public class UserInfo1006 internal constructor(
    usri1006HomeDirCtorArg: Pwstr,
) {
    public var usri1006HomeDir: Pwstr = usri1006HomeDirCtorArg
        internal set

    public constructor() : this(
        usri1006HomeDirCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1006HomeDir

    public fun copy(usri1006HomeDir: Pwstr = this.usri1006HomeDir): UserInfo1006 = UserInfo1006(usri1006HomeDirCtorArg = usri1006HomeDir)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1006) return false
        if (this.usri1006HomeDir != other.usri1006HomeDir) return false
        return true
    }

    override fun hashCode(): Int = this.usri1006HomeDir.hashCode()

    public companion object {
        public operator fun invoke(
            usri1006HomeDir: Pwstr = MutPtr(0L),
        ): UserInfo1006 =
            UserInfo1006(
                usri1006HomeDirCtorArg = usri1006HomeDir,
            )
    }
}

public class UserInfo1007 internal constructor(
    usri1007CommentCtorArg: Pwstr,
) {
    public var usri1007Comment: Pwstr = usri1007CommentCtorArg
        internal set

    public constructor() : this(
        usri1007CommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1007Comment

    public fun copy(usri1007Comment: Pwstr = this.usri1007Comment): UserInfo1007 = UserInfo1007(usri1007CommentCtorArg = usri1007Comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1007) return false
        if (this.usri1007Comment != other.usri1007Comment) return false
        return true
    }

    override fun hashCode(): Int = this.usri1007Comment.hashCode()

    public companion object {
        public operator fun invoke(
            usri1007Comment: Pwstr = MutPtr(0L),
        ): UserInfo1007 =
            UserInfo1007(
                usri1007CommentCtorArg = usri1007Comment,
            )
    }
}

public data class UserInfo1008(
    public var usri1008Flags: UserAccountFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1008> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1008> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1008 =
                    UserInfo1008(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1008) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1008Flags)
                }
            }
    }
}

public class UserInfo1009 internal constructor(
    usri1009ScriptPathCtorArg: Pwstr,
) {
    public var usri1009ScriptPath: Pwstr = usri1009ScriptPathCtorArg
        internal set

    public constructor() : this(
        usri1009ScriptPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1009ScriptPath

    public fun copy(usri1009ScriptPath: Pwstr = this.usri1009ScriptPath): UserInfo1009 = UserInfo1009(usri1009ScriptPathCtorArg = usri1009ScriptPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1009) return false
        if (this.usri1009ScriptPath != other.usri1009ScriptPath) return false
        return true
    }

    override fun hashCode(): Int = this.usri1009ScriptPath.hashCode()

    public companion object {
        public operator fun invoke(
            usri1009ScriptPath: Pwstr = MutPtr(0L),
        ): UserInfo1009 =
            UserInfo1009(
                usri1009ScriptPathCtorArg = usri1009ScriptPath,
            )
    }
}

public data class UserInfo1010(
    public var usri1010AuthFlags: AfOp = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1010> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1010 =
                    UserInfo1010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1010AuthFlags)
                }
            }
    }
}

public class UserInfo1011 internal constructor(
    usri1011FullNameCtorArg: Pwstr,
) {
    public var usri1011FullName: Pwstr = usri1011FullNameCtorArg
        internal set

    public constructor() : this(
        usri1011FullNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1011FullName

    public fun copy(usri1011FullName: Pwstr = this.usri1011FullName): UserInfo1011 = UserInfo1011(usri1011FullNameCtorArg = usri1011FullName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1011) return false
        if (this.usri1011FullName != other.usri1011FullName) return false
        return true
    }

    override fun hashCode(): Int = this.usri1011FullName.hashCode()

    public companion object {
        public operator fun invoke(
            usri1011FullName: Pwstr = MutPtr(0L),
        ): UserInfo1011 =
            UserInfo1011(
                usri1011FullNameCtorArg = usri1011FullName,
            )
    }
}

public class UserInfo1012 internal constructor(
    usri1012UsrCommentCtorArg: Pwstr,
) {
    public var usri1012UsrComment: Pwstr = usri1012UsrCommentCtorArg
        internal set

    public constructor() : this(
        usri1012UsrCommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1012UsrComment

    public fun copy(usri1012UsrComment: Pwstr = this.usri1012UsrComment): UserInfo1012 = UserInfo1012(usri1012UsrCommentCtorArg = usri1012UsrComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1012) return false
        if (this.usri1012UsrComment != other.usri1012UsrComment) return false
        return true
    }

    override fun hashCode(): Int = this.usri1012UsrComment.hashCode()

    public companion object {
        public operator fun invoke(
            usri1012UsrComment: Pwstr = MutPtr(0L),
        ): UserInfo1012 =
            UserInfo1012(
                usri1012UsrCommentCtorArg = usri1012UsrComment,
            )
    }
}

public class UserInfo1013 internal constructor(
    usri1013ParmsCtorArg: Pwstr,
) {
    public var usri1013Parms: Pwstr = usri1013ParmsCtorArg
        internal set

    public constructor() : this(
        usri1013ParmsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1013Parms

    public fun copy(usri1013Parms: Pwstr = this.usri1013Parms): UserInfo1013 = UserInfo1013(usri1013ParmsCtorArg = usri1013Parms)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1013) return false
        if (this.usri1013Parms != other.usri1013Parms) return false
        return true
    }

    override fun hashCode(): Int = this.usri1013Parms.hashCode()

    public companion object {
        public operator fun invoke(
            usri1013Parms: Pwstr = MutPtr(0L),
        ): UserInfo1013 =
            UserInfo1013(
                usri1013ParmsCtorArg = usri1013Parms,
            )
    }
}

public class UserInfo1014 internal constructor(
    usri1014WorkstationsCtorArg: Pwstr,
) {
    public var usri1014Workstations: Pwstr = usri1014WorkstationsCtorArg
        internal set

    public constructor() : this(
        usri1014WorkstationsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1014Workstations

    public fun copy(usri1014Workstations: Pwstr = this.usri1014Workstations): UserInfo1014 = UserInfo1014(usri1014WorkstationsCtorArg = usri1014Workstations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1014) return false
        if (this.usri1014Workstations != other.usri1014Workstations) return false
        return true
    }

    override fun hashCode(): Int = this.usri1014Workstations.hashCode()

    public companion object {
        public operator fun invoke(
            usri1014Workstations: Pwstr = MutPtr(0L),
        ): UserInfo1014 =
            UserInfo1014(
                usri1014WorkstationsCtorArg = usri1014Workstations,
            )
    }
}

public data class UserInfo1017(
    public var usri1017AcctExpires: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1017> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1017> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1017 =
                    UserInfo1017(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1017) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1017AcctExpires)
                }
            }
    }
}

public data class UserInfo1018(
    public var usri1018MaxStorage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1018> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1018> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1018 =
                    UserInfo1018(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1018) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1018MaxStorage)
                }
            }
    }
}

public class UserInfo1020 internal constructor(
    public var usri1020UnitsPerWeek: UInt,
    usri1020LogonHoursCtorArg: MutPtr,
) {
    public var usri1020LogonHours: MutPtr = usri1020LogonHoursCtorArg
        internal set

    public constructor() : this(
        usri1020UnitsPerWeek = 0u,
        usri1020LogonHoursCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.usri1020UnitsPerWeek

    public operator fun component2(): MutPtr = this.usri1020LogonHours

    public fun copy(usri1020UnitsPerWeek: UInt = this.usri1020UnitsPerWeek, usri1020LogonHours: MutPtr = this.usri1020LogonHours): UserInfo1020 = UserInfo1020(usri1020UnitsPerWeek = usri1020UnitsPerWeek, usri1020LogonHoursCtorArg = usri1020LogonHours)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1020) return false
        if (this.usri1020UnitsPerWeek != other.usri1020UnitsPerWeek) return false
        if (this.usri1020LogonHours != other.usri1020LogonHours) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri1020UnitsPerWeek.hashCode()
        result = 31 * result + this.usri1020LogonHours.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1020> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UserInfo1020 =
                    UserInfo1020(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UserInfo1020) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1020UnitsPerWeek)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.usri1020LogonHours)
                }
            }

        public operator fun invoke(
            usri1020UnitsPerWeek: UInt = 0u,
            usri1020LogonHours: MutPtr = MutPtr(0L),
        ): UserInfo1020 =
            UserInfo1020(
                usri1020UnitsPerWeek = usri1020UnitsPerWeek,
                usri1020LogonHoursCtorArg = usri1020LogonHours,
            )
    }
}

public class UserInfo1023 internal constructor(
    usri1023LogonServerCtorArg: Pwstr,
) {
    public var usri1023LogonServer: Pwstr = usri1023LogonServerCtorArg
        internal set

    public constructor() : this(
        usri1023LogonServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1023LogonServer

    public fun copy(usri1023LogonServer: Pwstr = this.usri1023LogonServer): UserInfo1023 = UserInfo1023(usri1023LogonServerCtorArg = usri1023LogonServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1023) return false
        if (this.usri1023LogonServer != other.usri1023LogonServer) return false
        return true
    }

    override fun hashCode(): Int = this.usri1023LogonServer.hashCode()

    public companion object {
        public operator fun invoke(
            usri1023LogonServer: Pwstr = MutPtr(0L),
        ): UserInfo1023 =
            UserInfo1023(
                usri1023LogonServerCtorArg = usri1023LogonServer,
            )
    }
}

public data class UserInfo1024(
    public var usri1024CountryCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1024> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1024> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1024 =
                    UserInfo1024(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1024) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1024CountryCode)
                }
            }
    }
}

public data class UserInfo1025(
    public var usri1025CodePage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1025> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1025> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1025 =
                    UserInfo1025(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1025) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1025CodePage)
                }
            }
    }
}

public data class UserInfo1051(
    public var usri1051PrimaryGroupId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1051> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo1051> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserInfo1051 =
                    UserInfo1051(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserInfo1051) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usri1051PrimaryGroupId)
                }
            }
    }
}

public class UserInfo1052 internal constructor(
    usri1052ProfileCtorArg: Pwstr,
) {
    public var usri1052Profile: Pwstr = usri1052ProfileCtorArg
        internal set

    public constructor() : this(
        usri1052ProfileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1052Profile

    public fun copy(usri1052Profile: Pwstr = this.usri1052Profile): UserInfo1052 = UserInfo1052(usri1052ProfileCtorArg = usri1052Profile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1052) return false
        if (this.usri1052Profile != other.usri1052Profile) return false
        return true
    }

    override fun hashCode(): Int = this.usri1052Profile.hashCode()

    public companion object {
        public operator fun invoke(
            usri1052Profile: Pwstr = MutPtr(0L),
        ): UserInfo1052 =
            UserInfo1052(
                usri1052ProfileCtorArg = usri1052Profile,
            )
    }
}

public class UserInfo1053 internal constructor(
    usri1053HomeDirDriveCtorArg: Pwstr,
) {
    public var usri1053HomeDirDrive: Pwstr = usri1053HomeDirDriveCtorArg
        internal set

    public constructor() : this(
        usri1053HomeDirDriveCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri1053HomeDirDrive

    public fun copy(usri1053HomeDirDrive: Pwstr = this.usri1053HomeDirDrive): UserInfo1053 = UserInfo1053(usri1053HomeDirDriveCtorArg = usri1053HomeDirDrive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo1053) return false
        if (this.usri1053HomeDirDrive != other.usri1053HomeDirDrive) return false
        return true
    }

    override fun hashCode(): Int = this.usri1053HomeDirDrive.hashCode()

    public companion object {
        public operator fun invoke(
            usri1053HomeDirDrive: Pwstr = MutPtr(0L),
        ): UserInfo1053 =
            UserInfo1053(
                usri1053HomeDirDriveCtorArg = usri1053HomeDirDrive,
            )
    }
}

public class UserInfo11 internal constructor(
    usri11NameCtorArg: Pwstr,
    usri11CommentCtorArg: Pwstr,
    usri11UsrCommentCtorArg: Pwstr,
    usri11FullNameCtorArg: Pwstr,
    public var usri11Priv: UserPriv,
    public var usri11AuthFlags: AfOp,
    public var usri11PasswordAge: UInt,
    usri11HomeDirCtorArg: Pwstr,
    usri11ParmsCtorArg: Pwstr,
    public var usri11LastLogon: UInt,
    public var usri11LastLogoff: UInt,
    public var usri11BadPwCount: UInt,
    public var usri11NumLogons: UInt,
    usri11LogonServerCtorArg: Pwstr,
    public var usri11CountryCode: UInt,
    usri11WorkstationsCtorArg: Pwstr,
    public var usri11MaxStorage: UInt,
    public var usri11UnitsPerWeek: UInt,
    usri11LogonHoursCtorArg: MutPtr,
    public var usri11CodePage: UInt,
) {
    public var usri11Name: Pwstr = usri11NameCtorArg
        internal set

    public var usri11Comment: Pwstr = usri11CommentCtorArg
        internal set

    public var usri11UsrComment: Pwstr = usri11UsrCommentCtorArg
        internal set

    public var usri11FullName: Pwstr = usri11FullNameCtorArg
        internal set

    public var usri11HomeDir: Pwstr = usri11HomeDirCtorArg
        internal set

    public var usri11Parms: Pwstr = usri11ParmsCtorArg
        internal set

    public var usri11LogonServer: Pwstr = usri11LogonServerCtorArg
        internal set

    public var usri11Workstations: Pwstr = usri11WorkstationsCtorArg
        internal set

    public var usri11LogonHours: MutPtr = usri11LogonHoursCtorArg
        internal set

    public constructor() : this(
        usri11NameCtorArg = MutPtr(0L),
        usri11CommentCtorArg = MutPtr(0L),
        usri11UsrCommentCtorArg = MutPtr(0L),
        usri11FullNameCtorArg = MutPtr(0L),
        usri11Priv = 0u,
        usri11AuthFlags = 0u,
        usri11PasswordAge = 0u,
        usri11HomeDirCtorArg = MutPtr(0L),
        usri11ParmsCtorArg = MutPtr(0L),
        usri11LastLogon = 0u,
        usri11LastLogoff = 0u,
        usri11BadPwCount = 0u,
        usri11NumLogons = 0u,
        usri11LogonServerCtorArg = MutPtr(0L),
        usri11CountryCode = 0u,
        usri11WorkstationsCtorArg = MutPtr(0L),
        usri11MaxStorage = 0u,
        usri11UnitsPerWeek = 0u,
        usri11LogonHoursCtorArg = MutPtr(0L),
        usri11CodePage = 0u,
    )

    public companion object {
        public operator fun invoke(
            usri11Name: Pwstr = MutPtr(0L),
            usri11Comment: Pwstr = MutPtr(0L),
            usri11UsrComment: Pwstr = MutPtr(0L),
            usri11FullName: Pwstr = MutPtr(0L),
            usri11Priv: UserPriv = 0u,
            usri11AuthFlags: AfOp = 0u,
            usri11PasswordAge: UInt = 0u,
            usri11HomeDir: Pwstr = MutPtr(0L),
            usri11Parms: Pwstr = MutPtr(0L),
            usri11LastLogon: UInt = 0u,
            usri11LastLogoff: UInt = 0u,
            usri11BadPwCount: UInt = 0u,
            usri11NumLogons: UInt = 0u,
            usri11LogonServer: Pwstr = MutPtr(0L),
            usri11CountryCode: UInt = 0u,
            usri11Workstations: Pwstr = MutPtr(0L),
            usri11MaxStorage: UInt = 0u,
            usri11UnitsPerWeek: UInt = 0u,
            usri11LogonHours: MutPtr = MutPtr(0L),
            usri11CodePage: UInt = 0u,
        ): UserInfo11 =
            UserInfo11(
                usri11NameCtorArg = usri11Name,
                usri11CommentCtorArg = usri11Comment,
                usri11UsrCommentCtorArg = usri11UsrComment,
                usri11FullNameCtorArg = usri11FullName,
                usri11Priv = usri11Priv,
                usri11AuthFlags = usri11AuthFlags,
                usri11PasswordAge = usri11PasswordAge,
                usri11HomeDirCtorArg = usri11HomeDir,
                usri11ParmsCtorArg = usri11Parms,
                usri11LastLogon = usri11LastLogon,
                usri11LastLogoff = usri11LastLogoff,
                usri11BadPwCount = usri11BadPwCount,
                usri11NumLogons = usri11NumLogons,
                usri11LogonServerCtorArg = usri11LogonServer,
                usri11CountryCode = usri11CountryCode,
                usri11WorkstationsCtorArg = usri11Workstations,
                usri11MaxStorage = usri11MaxStorage,
                usri11UnitsPerWeek = usri11UnitsPerWeek,
                usri11LogonHoursCtorArg = usri11LogonHours,
                usri11CodePage = usri11CodePage,
            )
    }
}

public class UserInfo2 internal constructor(
    usri2NameCtorArg: Pwstr,
    usri2PasswordCtorArg: Pwstr,
    public var usri2PasswordAge: UInt,
    public var usri2Priv: UserPriv,
    usri2HomeDirCtorArg: Pwstr,
    usri2CommentCtorArg: Pwstr,
    public var usri2Flags: UserAccountFlags,
    usri2ScriptPathCtorArg: Pwstr,
    public var usri2AuthFlags: AfOp,
    usri2FullNameCtorArg: Pwstr,
    usri2UsrCommentCtorArg: Pwstr,
    usri2ParmsCtorArg: Pwstr,
    usri2WorkstationsCtorArg: Pwstr,
    public var usri2LastLogon: UInt,
    public var usri2LastLogoff: UInt,
    public var usri2AcctExpires: UInt,
    public var usri2MaxStorage: UInt,
    public var usri2UnitsPerWeek: UInt,
    usri2LogonHoursCtorArg: MutPtr,
    public var usri2BadPwCount: UInt,
    public var usri2NumLogons: UInt,
    usri2LogonServerCtorArg: Pwstr,
    public var usri2CountryCode: UInt,
    public var usri2CodePage: UInt,
) {
    public var usri2Name: Pwstr = usri2NameCtorArg
        internal set

    public var usri2Password: Pwstr = usri2PasswordCtorArg
        internal set

    public var usri2HomeDir: Pwstr = usri2HomeDirCtorArg
        internal set

    public var usri2Comment: Pwstr = usri2CommentCtorArg
        internal set

    public var usri2ScriptPath: Pwstr = usri2ScriptPathCtorArg
        internal set

    public var usri2FullName: Pwstr = usri2FullNameCtorArg
        internal set

    public var usri2UsrComment: Pwstr = usri2UsrCommentCtorArg
        internal set

    public var usri2Parms: Pwstr = usri2ParmsCtorArg
        internal set

    public var usri2Workstations: Pwstr = usri2WorkstationsCtorArg
        internal set

    public var usri2LogonHours: MutPtr = usri2LogonHoursCtorArg
        internal set

    public var usri2LogonServer: Pwstr = usri2LogonServerCtorArg
        internal set

    public constructor() : this(
        usri2NameCtorArg = MutPtr(0L),
        usri2PasswordCtorArg = MutPtr(0L),
        usri2PasswordAge = 0u,
        usri2Priv = 0u,
        usri2HomeDirCtorArg = MutPtr(0L),
        usri2CommentCtorArg = MutPtr(0L),
        usri2Flags = 0u,
        usri2ScriptPathCtorArg = MutPtr(0L),
        usri2AuthFlags = 0u,
        usri2FullNameCtorArg = MutPtr(0L),
        usri2UsrCommentCtorArg = MutPtr(0L),
        usri2ParmsCtorArg = MutPtr(0L),
        usri2WorkstationsCtorArg = MutPtr(0L),
        usri2LastLogon = 0u,
        usri2LastLogoff = 0u,
        usri2AcctExpires = 0u,
        usri2MaxStorage = 0u,
        usri2UnitsPerWeek = 0u,
        usri2LogonHoursCtorArg = MutPtr(0L),
        usri2BadPwCount = 0u,
        usri2NumLogons = 0u,
        usri2LogonServerCtorArg = MutPtr(0L),
        usri2CountryCode = 0u,
        usri2CodePage = 0u,
    )

    public companion object {
        public operator fun invoke(
            usri2Name: Pwstr = MutPtr(0L),
            usri2Password: Pwstr = MutPtr(0L),
            usri2PasswordAge: UInt = 0u,
            usri2Priv: UserPriv = 0u,
            usri2HomeDir: Pwstr = MutPtr(0L),
            usri2Comment: Pwstr = MutPtr(0L),
            usri2Flags: UserAccountFlags = 0u,
            usri2ScriptPath: Pwstr = MutPtr(0L),
            usri2AuthFlags: AfOp = 0u,
            usri2FullName: Pwstr = MutPtr(0L),
            usri2UsrComment: Pwstr = MutPtr(0L),
            usri2Parms: Pwstr = MutPtr(0L),
            usri2Workstations: Pwstr = MutPtr(0L),
            usri2LastLogon: UInt = 0u,
            usri2LastLogoff: UInt = 0u,
            usri2AcctExpires: UInt = 0u,
            usri2MaxStorage: UInt = 0u,
            usri2UnitsPerWeek: UInt = 0u,
            usri2LogonHours: MutPtr = MutPtr(0L),
            usri2BadPwCount: UInt = 0u,
            usri2NumLogons: UInt = 0u,
            usri2LogonServer: Pwstr = MutPtr(0L),
            usri2CountryCode: UInt = 0u,
            usri2CodePage: UInt = 0u,
        ): UserInfo2 =
            UserInfo2(
                usri2NameCtorArg = usri2Name,
                usri2PasswordCtorArg = usri2Password,
                usri2PasswordAge = usri2PasswordAge,
                usri2Priv = usri2Priv,
                usri2HomeDirCtorArg = usri2HomeDir,
                usri2CommentCtorArg = usri2Comment,
                usri2Flags = usri2Flags,
                usri2ScriptPathCtorArg = usri2ScriptPath,
                usri2AuthFlags = usri2AuthFlags,
                usri2FullNameCtorArg = usri2FullName,
                usri2UsrCommentCtorArg = usri2UsrComment,
                usri2ParmsCtorArg = usri2Parms,
                usri2WorkstationsCtorArg = usri2Workstations,
                usri2LastLogon = usri2LastLogon,
                usri2LastLogoff = usri2LastLogoff,
                usri2AcctExpires = usri2AcctExpires,
                usri2MaxStorage = usri2MaxStorage,
                usri2UnitsPerWeek = usri2UnitsPerWeek,
                usri2LogonHoursCtorArg = usri2LogonHours,
                usri2BadPwCount = usri2BadPwCount,
                usri2NumLogons = usri2NumLogons,
                usri2LogonServerCtorArg = usri2LogonServer,
                usri2CountryCode = usri2CountryCode,
                usri2CodePage = usri2CodePage,
            )
    }
}

public class UserInfo20 internal constructor(
    usri20NameCtorArg: Pwstr,
    usri20FullNameCtorArg: Pwstr,
    usri20CommentCtorArg: Pwstr,
    public var usri20Flags: UserAccountFlags,
    public var usri20UserId: UInt,
) {
    public var usri20Name: Pwstr = usri20NameCtorArg
        internal set

    public var usri20FullName: Pwstr = usri20FullNameCtorArg
        internal set

    public var usri20Comment: Pwstr = usri20CommentCtorArg
        internal set

    public constructor() : this(
        usri20NameCtorArg = MutPtr(0L),
        usri20FullNameCtorArg = MutPtr(0L),
        usri20CommentCtorArg = MutPtr(0L),
        usri20Flags = 0u,
        usri20UserId = 0u,
    )

    public operator fun component1(): Pwstr = this.usri20Name

    public operator fun component2(): Pwstr = this.usri20FullName

    public operator fun component3(): Pwstr = this.usri20Comment

    public operator fun component4(): UserAccountFlags = this.usri20Flags

    public operator fun component5(): UInt = this.usri20UserId

    public fun copy(usri20Name: Pwstr = this.usri20Name, usri20FullName: Pwstr = this.usri20FullName, usri20Comment: Pwstr = this.usri20Comment, usri20Flags: UserAccountFlags = this.usri20Flags, usri20UserId: UInt = this.usri20UserId): UserInfo20 = UserInfo20(usri20NameCtorArg = usri20Name, usri20FullNameCtorArg = usri20FullName, usri20CommentCtorArg = usri20Comment, usri20Flags = usri20Flags, usri20UserId = usri20UserId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo20) return false
        if (this.usri20Name != other.usri20Name) return false
        if (this.usri20FullName != other.usri20FullName) return false
        if (this.usri20Comment != other.usri20Comment) return false
        if (this.usri20Flags != other.usri20Flags) return false
        if (this.usri20UserId != other.usri20UserId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri20Name.hashCode()
        result = 31 * result + this.usri20FullName.hashCode()
        result = 31 * result + this.usri20Comment.hashCode()
        result = 31 * result + this.usri20Flags.hashCode()
        result = 31 * result + this.usri20UserId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri20Name: Pwstr = MutPtr(0L),
            usri20FullName: Pwstr = MutPtr(0L),
            usri20Comment: Pwstr = MutPtr(0L),
            usri20Flags: UserAccountFlags = 0u,
            usri20UserId: UInt = 0u,
        ): UserInfo20 =
            UserInfo20(
                usri20NameCtorArg = usri20Name,
                usri20FullNameCtorArg = usri20FullName,
                usri20CommentCtorArg = usri20Comment,
                usri20Flags = usri20Flags,
                usri20UserId = usri20UserId,
            )
    }
}

public data class UserInfo21(
    public var usri21Password: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo21) return false
        if (!this.usri21Password.contentEquals(other.usri21Password)) return false
        return true
    }

    override fun hashCode(): Int = this.usri21Password.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserInfo21> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UserInfo21 =
                    UserInfo21(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UserInfo21) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.usri21Password.toList())
                }
            }
    }
}

public class UserInfo22 internal constructor(
    usri22NameCtorArg: Pwstr,
    public var usri22Password: UByteArray,
    public var usri22PasswordAge: UInt,
    public var usri22Priv: UserPriv,
    usri22HomeDirCtorArg: Pwstr,
    usri22CommentCtorArg: Pwstr,
    public var usri22Flags: UserAccountFlags,
    usri22ScriptPathCtorArg: Pwstr,
    public var usri22AuthFlags: AfOp,
    usri22FullNameCtorArg: Pwstr,
    usri22UsrCommentCtorArg: Pwstr,
    usri22ParmsCtorArg: Pwstr,
    usri22WorkstationsCtorArg: Pwstr,
    public var usri22LastLogon: UInt,
    public var usri22LastLogoff: UInt,
    public var usri22AcctExpires: UInt,
    public var usri22MaxStorage: UInt,
    public var usri22UnitsPerWeek: UInt,
    usri22LogonHoursCtorArg: MutPtr,
    public var usri22BadPwCount: UInt,
    public var usri22NumLogons: UInt,
    usri22LogonServerCtorArg: Pwstr,
    public var usri22CountryCode: UInt,
    public var usri22CodePage: UInt,
) {
    public var usri22Name: Pwstr = usri22NameCtorArg
        internal set

    public var usri22HomeDir: Pwstr = usri22HomeDirCtorArg
        internal set

    public var usri22Comment: Pwstr = usri22CommentCtorArg
        internal set

    public var usri22ScriptPath: Pwstr = usri22ScriptPathCtorArg
        internal set

    public var usri22FullName: Pwstr = usri22FullNameCtorArg
        internal set

    public var usri22UsrComment: Pwstr = usri22UsrCommentCtorArg
        internal set

    public var usri22Parms: Pwstr = usri22ParmsCtorArg
        internal set

    public var usri22Workstations: Pwstr = usri22WorkstationsCtorArg
        internal set

    public var usri22LogonHours: MutPtr = usri22LogonHoursCtorArg
        internal set

    public var usri22LogonServer: Pwstr = usri22LogonServerCtorArg
        internal set

    public constructor() : this(
        usri22NameCtorArg = MutPtr(0L),
        usri22Password = UByteArray(16),
        usri22PasswordAge = 0u,
        usri22Priv = 0u,
        usri22HomeDirCtorArg = MutPtr(0L),
        usri22CommentCtorArg = MutPtr(0L),
        usri22Flags = 0u,
        usri22ScriptPathCtorArg = MutPtr(0L),
        usri22AuthFlags = 0u,
        usri22FullNameCtorArg = MutPtr(0L),
        usri22UsrCommentCtorArg = MutPtr(0L),
        usri22ParmsCtorArg = MutPtr(0L),
        usri22WorkstationsCtorArg = MutPtr(0L),
        usri22LastLogon = 0u,
        usri22LastLogoff = 0u,
        usri22AcctExpires = 0u,
        usri22MaxStorage = 0u,
        usri22UnitsPerWeek = 0u,
        usri22LogonHoursCtorArg = MutPtr(0L),
        usri22BadPwCount = 0u,
        usri22NumLogons = 0u,
        usri22LogonServerCtorArg = MutPtr(0L),
        usri22CountryCode = 0u,
        usri22CodePage = 0u,
    )

    public companion object {
        public operator fun invoke(
            usri22Name: Pwstr = MutPtr(0L),
            usri22Password: UByteArray = UByteArray(16),
            usri22PasswordAge: UInt = 0u,
            usri22Priv: UserPriv = 0u,
            usri22HomeDir: Pwstr = MutPtr(0L),
            usri22Comment: Pwstr = MutPtr(0L),
            usri22Flags: UserAccountFlags = 0u,
            usri22ScriptPath: Pwstr = MutPtr(0L),
            usri22AuthFlags: AfOp = 0u,
            usri22FullName: Pwstr = MutPtr(0L),
            usri22UsrComment: Pwstr = MutPtr(0L),
            usri22Parms: Pwstr = MutPtr(0L),
            usri22Workstations: Pwstr = MutPtr(0L),
            usri22LastLogon: UInt = 0u,
            usri22LastLogoff: UInt = 0u,
            usri22AcctExpires: UInt = 0u,
            usri22MaxStorage: UInt = 0u,
            usri22UnitsPerWeek: UInt = 0u,
            usri22LogonHours: MutPtr = MutPtr(0L),
            usri22BadPwCount: UInt = 0u,
            usri22NumLogons: UInt = 0u,
            usri22LogonServer: Pwstr = MutPtr(0L),
            usri22CountryCode: UInt = 0u,
            usri22CodePage: UInt = 0u,
        ): UserInfo22 =
            UserInfo22(
                usri22NameCtorArg = usri22Name,
                usri22Password = usri22Password,
                usri22PasswordAge = usri22PasswordAge,
                usri22Priv = usri22Priv,
                usri22HomeDirCtorArg = usri22HomeDir,
                usri22CommentCtorArg = usri22Comment,
                usri22Flags = usri22Flags,
                usri22ScriptPathCtorArg = usri22ScriptPath,
                usri22AuthFlags = usri22AuthFlags,
                usri22FullNameCtorArg = usri22FullName,
                usri22UsrCommentCtorArg = usri22UsrComment,
                usri22ParmsCtorArg = usri22Parms,
                usri22WorkstationsCtorArg = usri22Workstations,
                usri22LastLogon = usri22LastLogon,
                usri22LastLogoff = usri22LastLogoff,
                usri22AcctExpires = usri22AcctExpires,
                usri22MaxStorage = usri22MaxStorage,
                usri22UnitsPerWeek = usri22UnitsPerWeek,
                usri22LogonHoursCtorArg = usri22LogonHours,
                usri22BadPwCount = usri22BadPwCount,
                usri22NumLogons = usri22NumLogons,
                usri22LogonServerCtorArg = usri22LogonServer,
                usri22CountryCode = usri22CountryCode,
                usri22CodePage = usri22CodePage,
            )
    }
}

public class UserInfo23 internal constructor(
    usri23NameCtorArg: Pwstr,
    usri23FullNameCtorArg: Pwstr,
    usri23CommentCtorArg: Pwstr,
    public var usri23Flags: UserAccountFlags,
    usri23UserSidCtorArg: Psid,
) {
    public var usri23Name: Pwstr = usri23NameCtorArg
        internal set

    public var usri23FullName: Pwstr = usri23FullNameCtorArg
        internal set

    public var usri23Comment: Pwstr = usri23CommentCtorArg
        internal set

    public var usri23UserSid: Psid = usri23UserSidCtorArg
        internal set

    public constructor() : this(
        usri23NameCtorArg = MutPtr(0L),
        usri23FullNameCtorArg = MutPtr(0L),
        usri23CommentCtorArg = MutPtr(0L),
        usri23Flags = 0u,
        usri23UserSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usri23Name

    public operator fun component2(): Pwstr = this.usri23FullName

    public operator fun component3(): Pwstr = this.usri23Comment

    public operator fun component4(): UserAccountFlags = this.usri23Flags

    public operator fun component5(): Psid = this.usri23UserSid

    public fun copy(usri23Name: Pwstr = this.usri23Name, usri23FullName: Pwstr = this.usri23FullName, usri23Comment: Pwstr = this.usri23Comment, usri23Flags: UserAccountFlags = this.usri23Flags, usri23UserSid: Psid = this.usri23UserSid): UserInfo23 = UserInfo23(usri23NameCtorArg = usri23Name, usri23FullNameCtorArg = usri23FullName, usri23CommentCtorArg = usri23Comment, usri23Flags = usri23Flags, usri23UserSidCtorArg = usri23UserSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo23) return false
        if (this.usri23Name != other.usri23Name) return false
        if (this.usri23FullName != other.usri23FullName) return false
        if (this.usri23Comment != other.usri23Comment) return false
        if (this.usri23Flags != other.usri23Flags) return false
        if (this.usri23UserSid != other.usri23UserSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri23Name.hashCode()
        result = 31 * result + this.usri23FullName.hashCode()
        result = 31 * result + this.usri23Comment.hashCode()
        result = 31 * result + this.usri23Flags.hashCode()
        result = 31 * result + this.usri23UserSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri23Name: Pwstr = MutPtr(0L),
            usri23FullName: Pwstr = MutPtr(0L),
            usri23Comment: Pwstr = MutPtr(0L),
            usri23Flags: UserAccountFlags = 0u,
            usri23UserSid: Psid = MutPtr(0L),
        ): UserInfo23 =
            UserInfo23(
                usri23NameCtorArg = usri23Name,
                usri23FullNameCtorArg = usri23FullName,
                usri23CommentCtorArg = usri23Comment,
                usri23Flags = usri23Flags,
                usri23UserSidCtorArg = usri23UserSid,
            )
    }
}

public class UserInfo24 internal constructor(
    public var usri24InternetIdentity: Bool,
    public var usri24Flags: UInt,
    usri24InternetProviderNameCtorArg: Pwstr,
    usri24InternetPrincipalNameCtorArg: Pwstr,
    usri24UserSidCtorArg: Psid,
) {
    public var usri24InternetProviderName: Pwstr = usri24InternetProviderNameCtorArg
        internal set

    public var usri24InternetPrincipalName: Pwstr = usri24InternetPrincipalNameCtorArg
        internal set

    public var usri24UserSid: Psid = usri24UserSidCtorArg
        internal set

    public constructor() : this(
        usri24InternetIdentity = 0,
        usri24Flags = 0u,
        usri24InternetProviderNameCtorArg = MutPtr(0L),
        usri24InternetPrincipalNameCtorArg = MutPtr(0L),
        usri24UserSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.usri24InternetIdentity

    public operator fun component2(): UInt = this.usri24Flags

    public operator fun component3(): Pwstr = this.usri24InternetProviderName

    public operator fun component4(): Pwstr = this.usri24InternetPrincipalName

    public operator fun component5(): Psid = this.usri24UserSid

    public fun copy(usri24InternetIdentity: Bool = this.usri24InternetIdentity, usri24Flags: UInt = this.usri24Flags, usri24InternetProviderName: Pwstr = this.usri24InternetProviderName, usri24InternetPrincipalName: Pwstr = this.usri24InternetPrincipalName, usri24UserSid: Psid = this.usri24UserSid): UserInfo24 = UserInfo24(usri24InternetIdentity = usri24InternetIdentity, usri24Flags = usri24Flags, usri24InternetProviderNameCtorArg = usri24InternetProviderName, usri24InternetPrincipalNameCtorArg = usri24InternetPrincipalName, usri24UserSidCtorArg = usri24UserSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo24) return false
        if (this.usri24InternetIdentity != other.usri24InternetIdentity) return false
        if (this.usri24Flags != other.usri24Flags) return false
        if (this.usri24InternetProviderName != other.usri24InternetProviderName) return false
        if (this.usri24InternetPrincipalName != other.usri24InternetPrincipalName) return false
        if (this.usri24UserSid != other.usri24UserSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usri24InternetIdentity.hashCode()
        result = 31 * result + this.usri24Flags.hashCode()
        result = 31 * result + this.usri24InternetProviderName.hashCode()
        result = 31 * result + this.usri24InternetPrincipalName.hashCode()
        result = 31 * result + this.usri24UserSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usri24InternetIdentity: Bool = 0,
            usri24Flags: UInt = 0u,
            usri24InternetProviderName: Pwstr = MutPtr(0L),
            usri24InternetPrincipalName: Pwstr = MutPtr(0L),
            usri24UserSid: Psid = MutPtr(0L),
        ): UserInfo24 =
            UserInfo24(
                usri24InternetIdentity = usri24InternetIdentity,
                usri24Flags = usri24Flags,
                usri24InternetProviderNameCtorArg = usri24InternetProviderName,
                usri24InternetPrincipalNameCtorArg = usri24InternetPrincipalName,
                usri24UserSidCtorArg = usri24UserSid,
            )
    }
}

public class UserInfo3 internal constructor(
    usri3NameCtorArg: Pwstr,
    usri3PasswordCtorArg: Pwstr,
    public var usri3PasswordAge: UInt,
    public var usri3Priv: UserPriv,
    usri3HomeDirCtorArg: Pwstr,
    usri3CommentCtorArg: Pwstr,
    public var usri3Flags: UserAccountFlags,
    usri3ScriptPathCtorArg: Pwstr,
    public var usri3AuthFlags: AfOp,
    usri3FullNameCtorArg: Pwstr,
    usri3UsrCommentCtorArg: Pwstr,
    usri3ParmsCtorArg: Pwstr,
    usri3WorkstationsCtorArg: Pwstr,
    public var usri3LastLogon: UInt,
    public var usri3LastLogoff: UInt,
    public var usri3AcctExpires: UInt,
    public var usri3MaxStorage: UInt,
    public var usri3UnitsPerWeek: UInt,
    usri3LogonHoursCtorArg: MutPtr,
    public var usri3BadPwCount: UInt,
    public var usri3NumLogons: UInt,
    usri3LogonServerCtorArg: Pwstr,
    public var usri3CountryCode: UInt,
    public var usri3CodePage: UInt,
    public var usri3UserId: UInt,
    public var usri3PrimaryGroupId: UInt,
    usri3ProfileCtorArg: Pwstr,
    usri3HomeDirDriveCtorArg: Pwstr,
    public var usri3PasswordExpired: UInt,
) {
    public var usri3Name: Pwstr = usri3NameCtorArg
        internal set

    public var usri3Password: Pwstr = usri3PasswordCtorArg
        internal set

    public var usri3HomeDir: Pwstr = usri3HomeDirCtorArg
        internal set

    public var usri3Comment: Pwstr = usri3CommentCtorArg
        internal set

    public var usri3ScriptPath: Pwstr = usri3ScriptPathCtorArg
        internal set

    public var usri3FullName: Pwstr = usri3FullNameCtorArg
        internal set

    public var usri3UsrComment: Pwstr = usri3UsrCommentCtorArg
        internal set

    public var usri3Parms: Pwstr = usri3ParmsCtorArg
        internal set

    public var usri3Workstations: Pwstr = usri3WorkstationsCtorArg
        internal set

    public var usri3LogonHours: MutPtr = usri3LogonHoursCtorArg
        internal set

    public var usri3LogonServer: Pwstr = usri3LogonServerCtorArg
        internal set

    public var usri3Profile: Pwstr = usri3ProfileCtorArg
        internal set

    public var usri3HomeDirDrive: Pwstr = usri3HomeDirDriveCtorArg
        internal set

    public constructor() : this(
        usri3NameCtorArg = MutPtr(0L),
        usri3PasswordCtorArg = MutPtr(0L),
        usri3PasswordAge = 0u,
        usri3Priv = 0u,
        usri3HomeDirCtorArg = MutPtr(0L),
        usri3CommentCtorArg = MutPtr(0L),
        usri3Flags = 0u,
        usri3ScriptPathCtorArg = MutPtr(0L),
        usri3AuthFlags = 0u,
        usri3FullNameCtorArg = MutPtr(0L),
        usri3UsrCommentCtorArg = MutPtr(0L),
        usri3ParmsCtorArg = MutPtr(0L),
        usri3WorkstationsCtorArg = MutPtr(0L),
        usri3LastLogon = 0u,
        usri3LastLogoff = 0u,
        usri3AcctExpires = 0u,
        usri3MaxStorage = 0u,
        usri3UnitsPerWeek = 0u,
        usri3LogonHoursCtorArg = MutPtr(0L),
        usri3BadPwCount = 0u,
        usri3NumLogons = 0u,
        usri3LogonServerCtorArg = MutPtr(0L),
        usri3CountryCode = 0u,
        usri3CodePage = 0u,
        usri3UserId = 0u,
        usri3PrimaryGroupId = 0u,
        usri3ProfileCtorArg = MutPtr(0L),
        usri3HomeDirDriveCtorArg = MutPtr(0L),
        usri3PasswordExpired = 0u,
    )

    public companion object {
        public operator fun invoke(
            usri3Name: Pwstr = MutPtr(0L),
            usri3Password: Pwstr = MutPtr(0L),
            usri3PasswordAge: UInt = 0u,
            usri3Priv: UserPriv = 0u,
            usri3HomeDir: Pwstr = MutPtr(0L),
            usri3Comment: Pwstr = MutPtr(0L),
            usri3Flags: UserAccountFlags = 0u,
            usri3ScriptPath: Pwstr = MutPtr(0L),
            usri3AuthFlags: AfOp = 0u,
            usri3FullName: Pwstr = MutPtr(0L),
            usri3UsrComment: Pwstr = MutPtr(0L),
            usri3Parms: Pwstr = MutPtr(0L),
            usri3Workstations: Pwstr = MutPtr(0L),
            usri3LastLogon: UInt = 0u,
            usri3LastLogoff: UInt = 0u,
            usri3AcctExpires: UInt = 0u,
            usri3MaxStorage: UInt = 0u,
            usri3UnitsPerWeek: UInt = 0u,
            usri3LogonHours: MutPtr = MutPtr(0L),
            usri3BadPwCount: UInt = 0u,
            usri3NumLogons: UInt = 0u,
            usri3LogonServer: Pwstr = MutPtr(0L),
            usri3CountryCode: UInt = 0u,
            usri3CodePage: UInt = 0u,
            usri3UserId: UInt = 0u,
            usri3PrimaryGroupId: UInt = 0u,
            usri3Profile: Pwstr = MutPtr(0L),
            usri3HomeDirDrive: Pwstr = MutPtr(0L),
            usri3PasswordExpired: UInt = 0u,
        ): UserInfo3 =
            UserInfo3(
                usri3NameCtorArg = usri3Name,
                usri3PasswordCtorArg = usri3Password,
                usri3PasswordAge = usri3PasswordAge,
                usri3Priv = usri3Priv,
                usri3HomeDirCtorArg = usri3HomeDir,
                usri3CommentCtorArg = usri3Comment,
                usri3Flags = usri3Flags,
                usri3ScriptPathCtorArg = usri3ScriptPath,
                usri3AuthFlags = usri3AuthFlags,
                usri3FullNameCtorArg = usri3FullName,
                usri3UsrCommentCtorArg = usri3UsrComment,
                usri3ParmsCtorArg = usri3Parms,
                usri3WorkstationsCtorArg = usri3Workstations,
                usri3LastLogon = usri3LastLogon,
                usri3LastLogoff = usri3LastLogoff,
                usri3AcctExpires = usri3AcctExpires,
                usri3MaxStorage = usri3MaxStorage,
                usri3UnitsPerWeek = usri3UnitsPerWeek,
                usri3LogonHoursCtorArg = usri3LogonHours,
                usri3BadPwCount = usri3BadPwCount,
                usri3NumLogons = usri3NumLogons,
                usri3LogonServerCtorArg = usri3LogonServer,
                usri3CountryCode = usri3CountryCode,
                usri3CodePage = usri3CodePage,
                usri3UserId = usri3UserId,
                usri3PrimaryGroupId = usri3PrimaryGroupId,
                usri3ProfileCtorArg = usri3Profile,
                usri3HomeDirDriveCtorArg = usri3HomeDirDrive,
                usri3PasswordExpired = usri3PasswordExpired,
            )
    }
}

public class UserInfo4 internal constructor(
    usri4NameCtorArg: Pwstr,
    usri4PasswordCtorArg: Pwstr,
    public var usri4PasswordAge: UInt,
    public var usri4Priv: UserPriv,
    usri4HomeDirCtorArg: Pwstr,
    usri4CommentCtorArg: Pwstr,
    public var usri4Flags: UserAccountFlags,
    usri4ScriptPathCtorArg: Pwstr,
    public var usri4AuthFlags: AfOp,
    usri4FullNameCtorArg: Pwstr,
    usri4UsrCommentCtorArg: Pwstr,
    usri4ParmsCtorArg: Pwstr,
    usri4WorkstationsCtorArg: Pwstr,
    public var usri4LastLogon: UInt,
    public var usri4LastLogoff: UInt,
    public var usri4AcctExpires: UInt,
    public var usri4MaxStorage: UInt,
    public var usri4UnitsPerWeek: UInt,
    usri4LogonHoursCtorArg: MutPtr,
    public var usri4BadPwCount: UInt,
    public var usri4NumLogons: UInt,
    usri4LogonServerCtorArg: Pwstr,
    public var usri4CountryCode: UInt,
    public var usri4CodePage: UInt,
    usri4UserSidCtorArg: Psid,
    public var usri4PrimaryGroupId: UInt,
    usri4ProfileCtorArg: Pwstr,
    usri4HomeDirDriveCtorArg: Pwstr,
    public var usri4PasswordExpired: UInt,
) {
    public var usri4Name: Pwstr = usri4NameCtorArg
        internal set

    public var usri4Password: Pwstr = usri4PasswordCtorArg
        internal set

    public var usri4HomeDir: Pwstr = usri4HomeDirCtorArg
        internal set

    public var usri4Comment: Pwstr = usri4CommentCtorArg
        internal set

    public var usri4ScriptPath: Pwstr = usri4ScriptPathCtorArg
        internal set

    public var usri4FullName: Pwstr = usri4FullNameCtorArg
        internal set

    public var usri4UsrComment: Pwstr = usri4UsrCommentCtorArg
        internal set

    public var usri4Parms: Pwstr = usri4ParmsCtorArg
        internal set

    public var usri4Workstations: Pwstr = usri4WorkstationsCtorArg
        internal set

    public var usri4LogonHours: MutPtr = usri4LogonHoursCtorArg
        internal set

    public var usri4LogonServer: Pwstr = usri4LogonServerCtorArg
        internal set

    public var usri4UserSid: Psid = usri4UserSidCtorArg
        internal set

    public var usri4Profile: Pwstr = usri4ProfileCtorArg
        internal set

    public var usri4HomeDirDrive: Pwstr = usri4HomeDirDriveCtorArg
        internal set

    public constructor() : this(
        usri4NameCtorArg = MutPtr(0L),
        usri4PasswordCtorArg = MutPtr(0L),
        usri4PasswordAge = 0u,
        usri4Priv = 0u,
        usri4HomeDirCtorArg = MutPtr(0L),
        usri4CommentCtorArg = MutPtr(0L),
        usri4Flags = 0u,
        usri4ScriptPathCtorArg = MutPtr(0L),
        usri4AuthFlags = 0u,
        usri4FullNameCtorArg = MutPtr(0L),
        usri4UsrCommentCtorArg = MutPtr(0L),
        usri4ParmsCtorArg = MutPtr(0L),
        usri4WorkstationsCtorArg = MutPtr(0L),
        usri4LastLogon = 0u,
        usri4LastLogoff = 0u,
        usri4AcctExpires = 0u,
        usri4MaxStorage = 0u,
        usri4UnitsPerWeek = 0u,
        usri4LogonHoursCtorArg = MutPtr(0L),
        usri4BadPwCount = 0u,
        usri4NumLogons = 0u,
        usri4LogonServerCtorArg = MutPtr(0L),
        usri4CountryCode = 0u,
        usri4CodePage = 0u,
        usri4UserSidCtorArg = MutPtr(0L),
        usri4PrimaryGroupId = 0u,
        usri4ProfileCtorArg = MutPtr(0L),
        usri4HomeDirDriveCtorArg = MutPtr(0L),
        usri4PasswordExpired = 0u,
    )

    public companion object {
        public operator fun invoke(
            usri4Name: Pwstr = MutPtr(0L),
            usri4Password: Pwstr = MutPtr(0L),
            usri4PasswordAge: UInt = 0u,
            usri4Priv: UserPriv = 0u,
            usri4HomeDir: Pwstr = MutPtr(0L),
            usri4Comment: Pwstr = MutPtr(0L),
            usri4Flags: UserAccountFlags = 0u,
            usri4ScriptPath: Pwstr = MutPtr(0L),
            usri4AuthFlags: AfOp = 0u,
            usri4FullName: Pwstr = MutPtr(0L),
            usri4UsrComment: Pwstr = MutPtr(0L),
            usri4Parms: Pwstr = MutPtr(0L),
            usri4Workstations: Pwstr = MutPtr(0L),
            usri4LastLogon: UInt = 0u,
            usri4LastLogoff: UInt = 0u,
            usri4AcctExpires: UInt = 0u,
            usri4MaxStorage: UInt = 0u,
            usri4UnitsPerWeek: UInt = 0u,
            usri4LogonHours: MutPtr = MutPtr(0L),
            usri4BadPwCount: UInt = 0u,
            usri4NumLogons: UInt = 0u,
            usri4LogonServer: Pwstr = MutPtr(0L),
            usri4CountryCode: UInt = 0u,
            usri4CodePage: UInt = 0u,
            usri4UserSid: Psid = MutPtr(0L),
            usri4PrimaryGroupId: UInt = 0u,
            usri4Profile: Pwstr = MutPtr(0L),
            usri4HomeDirDrive: Pwstr = MutPtr(0L),
            usri4PasswordExpired: UInt = 0u,
        ): UserInfo4 =
            UserInfo4(
                usri4NameCtorArg = usri4Name,
                usri4PasswordCtorArg = usri4Password,
                usri4PasswordAge = usri4PasswordAge,
                usri4Priv = usri4Priv,
                usri4HomeDirCtorArg = usri4HomeDir,
                usri4CommentCtorArg = usri4Comment,
                usri4Flags = usri4Flags,
                usri4ScriptPathCtorArg = usri4ScriptPath,
                usri4AuthFlags = usri4AuthFlags,
                usri4FullNameCtorArg = usri4FullName,
                usri4UsrCommentCtorArg = usri4UsrComment,
                usri4ParmsCtorArg = usri4Parms,
                usri4WorkstationsCtorArg = usri4Workstations,
                usri4LastLogon = usri4LastLogon,
                usri4LastLogoff = usri4LastLogoff,
                usri4AcctExpires = usri4AcctExpires,
                usri4MaxStorage = usri4MaxStorage,
                usri4UnitsPerWeek = usri4UnitsPerWeek,
                usri4LogonHoursCtorArg = usri4LogonHours,
                usri4BadPwCount = usri4BadPwCount,
                usri4NumLogons = usri4NumLogons,
                usri4LogonServerCtorArg = usri4LogonServer,
                usri4CountryCode = usri4CountryCode,
                usri4CodePage = usri4CodePage,
                usri4UserSidCtorArg = usri4UserSid,
                usri4PrimaryGroupId = usri4PrimaryGroupId,
                usri4ProfileCtorArg = usri4Profile,
                usri4HomeDirDriveCtorArg = usri4HomeDirDrive,
                usri4PasswordExpired = usri4PasswordExpired,
            )
    }
}

public data class UserModalsInfo0(
    public var usrmod0MinPasswdLen: UInt = 0u,
    public var usrmod0MaxPasswdAge: UInt = 0u,
    public var usrmod0MinPasswdAge: UInt = 0u,
    public var usrmod0ForceLogoff: UInt = 0u,
    public var usrmod0PasswordHistLen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UserModalsInfo0 =
                    UserModalsInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod0MinPasswdLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.usrmod0MaxPasswdAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.usrmod0MinPasswdAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.usrmod0ForceLogoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.usrmod0PasswordHistLen)
                }
            }
    }
}

public class UserModalsInfo1 internal constructor(
    public var usrmod1Role: UInt,
    usrmod1PrimaryCtorArg: Pwstr,
) {
    public var usrmod1Primary: Pwstr = usrmod1PrimaryCtorArg
        internal set

    public constructor() : this(
        usrmod1Role = 0u,
        usrmod1PrimaryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.usrmod1Role

    public operator fun component2(): Pwstr = this.usrmod1Primary

    public fun copy(usrmod1Role: UInt = this.usrmod1Role, usrmod1Primary: Pwstr = this.usrmod1Primary): UserModalsInfo1 = UserModalsInfo1(usrmod1Role = usrmod1Role, usrmod1PrimaryCtorArg = usrmod1Primary)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserModalsInfo1) return false
        if (this.usrmod1Role != other.usrmod1Role) return false
        if (this.usrmod1Primary != other.usrmod1Primary) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usrmod1Role.hashCode()
        result = 31 * result + this.usrmod1Primary.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usrmod1Role: UInt = 0u,
            usrmod1Primary: Pwstr = MutPtr(0L),
        ): UserModalsInfo1 =
            UserModalsInfo1(
                usrmod1Role = usrmod1Role,
                usrmod1PrimaryCtorArg = usrmod1Primary,
            )
    }
}

public data class UserModalsInfo1001(
    public var usrmod1001MinPasswdLen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1001> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1001> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1001 =
                    UserModalsInfo1001(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1001) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1001MinPasswdLen)
                }
            }
    }
}

public data class UserModalsInfo1002(
    public var usrmod1002MaxPasswdAge: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1002> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1002> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1002 =
                    UserModalsInfo1002(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1002) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1002MaxPasswdAge)
                }
            }
    }
}

public data class UserModalsInfo1003(
    public var usrmod1003MinPasswdAge: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1003> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1003> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1003 =
                    UserModalsInfo1003(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1003) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1003MinPasswdAge)
                }
            }
    }
}

public data class UserModalsInfo1004(
    public var usrmod1004ForceLogoff: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1004> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1004> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1004 =
                    UserModalsInfo1004(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1004) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1004ForceLogoff)
                }
            }
    }
}

public data class UserModalsInfo1005(
    public var usrmod1005PasswordHistLen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1005> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1005> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1005 =
                    UserModalsInfo1005(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1005) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1005PasswordHistLen)
                }
            }
    }
}

public data class UserModalsInfo1006(
    public var usrmod1006Role: UserModalsRoles = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1006> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo1006> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UserModalsInfo1006 =
                    UserModalsInfo1006(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo1006) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod1006Role)
                }
            }
    }
}

public class UserModalsInfo1007 internal constructor(
    usrmod1007PrimaryCtorArg: Pwstr,
) {
    public var usrmod1007Primary: Pwstr = usrmod1007PrimaryCtorArg
        internal set

    public constructor() : this(
        usrmod1007PrimaryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usrmod1007Primary

    public fun copy(usrmod1007Primary: Pwstr = this.usrmod1007Primary): UserModalsInfo1007 = UserModalsInfo1007(usrmod1007PrimaryCtorArg = usrmod1007Primary)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserModalsInfo1007) return false
        if (this.usrmod1007Primary != other.usrmod1007Primary) return false
        return true
    }

    override fun hashCode(): Int = this.usrmod1007Primary.hashCode()

    public companion object {
        public operator fun invoke(
            usrmod1007Primary: Pwstr = MutPtr(0L),
        ): UserModalsInfo1007 =
            UserModalsInfo1007(
                usrmod1007PrimaryCtorArg = usrmod1007Primary,
            )
    }
}

public class UserModalsInfo2 internal constructor(
    usrmod2DomainNameCtorArg: Pwstr,
    usrmod2DomainIdCtorArg: Psid,
) {
    public var usrmod2DomainName: Pwstr = usrmod2DomainNameCtorArg
        internal set

    public var usrmod2DomainId: Psid = usrmod2DomainIdCtorArg
        internal set

    public constructor() : this(
        usrmod2DomainNameCtorArg = MutPtr(0L),
        usrmod2DomainIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.usrmod2DomainName

    public operator fun component2(): Psid = this.usrmod2DomainId

    public fun copy(usrmod2DomainName: Pwstr = this.usrmod2DomainName, usrmod2DomainId: Psid = this.usrmod2DomainId): UserModalsInfo2 = UserModalsInfo2(usrmod2DomainNameCtorArg = usrmod2DomainName, usrmod2DomainIdCtorArg = usrmod2DomainId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserModalsInfo2) return false
        if (this.usrmod2DomainName != other.usrmod2DomainName) return false
        if (this.usrmod2DomainId != other.usrmod2DomainId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usrmod2DomainName.hashCode()
        result = 31 * result + this.usrmod2DomainId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usrmod2DomainName: Pwstr = MutPtr(0L),
            usrmod2DomainId: Psid = MutPtr(0L),
        ): UserModalsInfo2 =
            UserModalsInfo2(
                usrmod2DomainNameCtorArg = usrmod2DomainName,
                usrmod2DomainIdCtorArg = usrmod2DomainId,
            )
    }
}

public data class UserModalsInfo3(
    public var usrmod3LockoutDuration: UInt = 0u,
    public var usrmod3LockoutObservationWindow: UInt = 0u,
    public var usrmod3LockoutThreshold: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserModalsInfo3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UserModalsInfo3 =
                    UserModalsInfo3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UserModalsInfo3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usrmod3LockoutDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.usrmod3LockoutObservationWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.usrmod3LockoutThreshold)
                }
            }
    }
}

public data class UserOtherInfo(
    public var alrtusErrcode: UInt = 0u,
    public var alrtusNumstrings: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserOtherInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserOtherInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UserOtherInfo =
                    UserOtherInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UserOtherInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alrtusErrcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alrtusNumstrings)
                }
            }
    }
}

public class UseInfo0 internal constructor(
    ui0LocalCtorArg: Pwstr,
    ui0RemoteCtorArg: Pwstr,
) {
    public var ui0Local: Pwstr = ui0LocalCtorArg
        internal set

    public var ui0Remote: Pwstr = ui0RemoteCtorArg
        internal set

    public constructor() : this(
        ui0LocalCtorArg = MutPtr(0L),
        ui0RemoteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.ui0Local

    public operator fun component2(): Pwstr = this.ui0Remote

    public fun copy(ui0Local: Pwstr = this.ui0Local, ui0Remote: Pwstr = this.ui0Remote): UseInfo0 = UseInfo0(ui0LocalCtorArg = ui0Local, ui0RemoteCtorArg = ui0Remote)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseInfo0) return false
        if (this.ui0Local != other.ui0Local) return false
        if (this.ui0Remote != other.ui0Remote) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ui0Local.hashCode()
        result = 31 * result + this.ui0Remote.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ui0Local: Pwstr = MutPtr(0L),
            ui0Remote: Pwstr = MutPtr(0L),
        ): UseInfo0 =
            UseInfo0(
                ui0LocalCtorArg = ui0Local,
                ui0RemoteCtorArg = ui0Remote,
            )
    }
}

public class UseInfo1 internal constructor(
    ui1LocalCtorArg: Pwstr,
    ui1RemoteCtorArg: Pwstr,
    ui1PasswordCtorArg: Pwstr,
    public var ui1Status: UInt,
    public var ui1AsgType: UseInfoAsgType,
    public var ui1Refcount: UInt,
    public var ui1Usecount: UInt,
) {
    public var ui1Local: Pwstr = ui1LocalCtorArg
        internal set

    public var ui1Remote: Pwstr = ui1RemoteCtorArg
        internal set

    public var ui1Password: Pwstr = ui1PasswordCtorArg
        internal set

    public constructor() : this(
        ui1LocalCtorArg = MutPtr(0L),
        ui1RemoteCtorArg = MutPtr(0L),
        ui1PasswordCtorArg = MutPtr(0L),
        ui1Status = 0u,
        ui1AsgType = 0u,
        ui1Refcount = 0u,
        ui1Usecount = 0u,
    )

    public operator fun component1(): Pwstr = this.ui1Local

    public operator fun component2(): Pwstr = this.ui1Remote

    public operator fun component3(): Pwstr = this.ui1Password

    public operator fun component4(): UInt = this.ui1Status

    public operator fun component5(): UseInfoAsgType = this.ui1AsgType

    public operator fun component6(): UInt = this.ui1Refcount

    public operator fun component7(): UInt = this.ui1Usecount

    public fun copy(ui1Local: Pwstr = this.ui1Local, ui1Remote: Pwstr = this.ui1Remote, ui1Password: Pwstr = this.ui1Password, ui1Status: UInt = this.ui1Status, ui1AsgType: UseInfoAsgType = this.ui1AsgType, ui1Refcount: UInt = this.ui1Refcount, ui1Usecount: UInt = this.ui1Usecount): UseInfo1 = UseInfo1(ui1LocalCtorArg = ui1Local, ui1RemoteCtorArg = ui1Remote, ui1PasswordCtorArg = ui1Password, ui1Status = ui1Status, ui1AsgType = ui1AsgType, ui1Refcount = ui1Refcount, ui1Usecount = ui1Usecount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseInfo1) return false
        if (this.ui1Local != other.ui1Local) return false
        if (this.ui1Remote != other.ui1Remote) return false
        if (this.ui1Password != other.ui1Password) return false
        if (this.ui1Status != other.ui1Status) return false
        if (this.ui1AsgType != other.ui1AsgType) return false
        if (this.ui1Refcount != other.ui1Refcount) return false
        if (this.ui1Usecount != other.ui1Usecount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ui1Local.hashCode()
        result = 31 * result + this.ui1Remote.hashCode()
        result = 31 * result + this.ui1Password.hashCode()
        result = 31 * result + this.ui1Status.hashCode()
        result = 31 * result + this.ui1AsgType.hashCode()
        result = 31 * result + this.ui1Refcount.hashCode()
        result = 31 * result + this.ui1Usecount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ui1Local: Pwstr = MutPtr(0L),
            ui1Remote: Pwstr = MutPtr(0L),
            ui1Password: Pwstr = MutPtr(0L),
            ui1Status: UInt = 0u,
            ui1AsgType: UseInfoAsgType = 0u,
            ui1Refcount: UInt = 0u,
            ui1Usecount: UInt = 0u,
        ): UseInfo1 =
            UseInfo1(
                ui1LocalCtorArg = ui1Local,
                ui1RemoteCtorArg = ui1Remote,
                ui1PasswordCtorArg = ui1Password,
                ui1Status = ui1Status,
                ui1AsgType = ui1AsgType,
                ui1Refcount = ui1Refcount,
                ui1Usecount = ui1Usecount,
            )
    }
}

public class UseInfo2 internal constructor(
    ui2LocalCtorArg: Pwstr,
    ui2RemoteCtorArg: Pwstr,
    ui2PasswordCtorArg: Pwstr,
    public var ui2Status: UInt,
    public var ui2AsgType: UseInfoAsgType,
    public var ui2Refcount: UInt,
    public var ui2Usecount: UInt,
    ui2UsernameCtorArg: Pwstr,
    ui2DomainnameCtorArg: Pwstr,
) {
    public var ui2Local: Pwstr = ui2LocalCtorArg
        internal set

    public var ui2Remote: Pwstr = ui2RemoteCtorArg
        internal set

    public var ui2Password: Pwstr = ui2PasswordCtorArg
        internal set

    public var ui2Username: Pwstr = ui2UsernameCtorArg
        internal set

    public var ui2Domainname: Pwstr = ui2DomainnameCtorArg
        internal set

    public constructor() : this(
        ui2LocalCtorArg = MutPtr(0L),
        ui2RemoteCtorArg = MutPtr(0L),
        ui2PasswordCtorArg = MutPtr(0L),
        ui2Status = 0u,
        ui2AsgType = 0u,
        ui2Refcount = 0u,
        ui2Usecount = 0u,
        ui2UsernameCtorArg = MutPtr(0L),
        ui2DomainnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.ui2Local

    public operator fun component2(): Pwstr = this.ui2Remote

    public operator fun component3(): Pwstr = this.ui2Password

    public operator fun component4(): UInt = this.ui2Status

    public operator fun component5(): UseInfoAsgType = this.ui2AsgType

    public operator fun component6(): UInt = this.ui2Refcount

    public operator fun component7(): UInt = this.ui2Usecount

    public operator fun component8(): Pwstr = this.ui2Username

    public operator fun component9(): Pwstr = this.ui2Domainname

    public fun copy(ui2Local: Pwstr = this.ui2Local, ui2Remote: Pwstr = this.ui2Remote, ui2Password: Pwstr = this.ui2Password, ui2Status: UInt = this.ui2Status, ui2AsgType: UseInfoAsgType = this.ui2AsgType, ui2Refcount: UInt = this.ui2Refcount, ui2Usecount: UInt = this.ui2Usecount, ui2Username: Pwstr = this.ui2Username, ui2Domainname: Pwstr = this.ui2Domainname): UseInfo2 = UseInfo2(ui2LocalCtorArg = ui2Local, ui2RemoteCtorArg = ui2Remote, ui2PasswordCtorArg = ui2Password, ui2Status = ui2Status, ui2AsgType = ui2AsgType, ui2Refcount = ui2Refcount, ui2Usecount = ui2Usecount, ui2UsernameCtorArg = ui2Username, ui2DomainnameCtorArg = ui2Domainname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseInfo2) return false
        if (this.ui2Local != other.ui2Local) return false
        if (this.ui2Remote != other.ui2Remote) return false
        if (this.ui2Password != other.ui2Password) return false
        if (this.ui2Status != other.ui2Status) return false
        if (this.ui2AsgType != other.ui2AsgType) return false
        if (this.ui2Refcount != other.ui2Refcount) return false
        if (this.ui2Usecount != other.ui2Usecount) return false
        if (this.ui2Username != other.ui2Username) return false
        if (this.ui2Domainname != other.ui2Domainname) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ui2Local.hashCode()
        result = 31 * result + this.ui2Remote.hashCode()
        result = 31 * result + this.ui2Password.hashCode()
        result = 31 * result + this.ui2Status.hashCode()
        result = 31 * result + this.ui2AsgType.hashCode()
        result = 31 * result + this.ui2Refcount.hashCode()
        result = 31 * result + this.ui2Usecount.hashCode()
        result = 31 * result + this.ui2Username.hashCode()
        result = 31 * result + this.ui2Domainname.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ui2Local: Pwstr = MutPtr(0L),
            ui2Remote: Pwstr = MutPtr(0L),
            ui2Password: Pwstr = MutPtr(0L),
            ui2Status: UInt = 0u,
            ui2AsgType: UseInfoAsgType = 0u,
            ui2Refcount: UInt = 0u,
            ui2Usecount: UInt = 0u,
            ui2Username: Pwstr = MutPtr(0L),
            ui2Domainname: Pwstr = MutPtr(0L),
        ): UseInfo2 =
            UseInfo2(
                ui2LocalCtorArg = ui2Local,
                ui2RemoteCtorArg = ui2Remote,
                ui2PasswordCtorArg = ui2Password,
                ui2Status = ui2Status,
                ui2AsgType = ui2AsgType,
                ui2Refcount = ui2Refcount,
                ui2Usecount = ui2Usecount,
                ui2UsernameCtorArg = ui2Username,
                ui2DomainnameCtorArg = ui2Domainname,
            )
    }
}
