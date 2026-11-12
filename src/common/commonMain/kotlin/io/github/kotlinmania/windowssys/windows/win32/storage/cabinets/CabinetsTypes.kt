package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr

public typealias Fcierror = Int

public typealias FdicreateCpuType = Int

public typealias Fdidecrypttype = Int

public typealias Fdierror = Int

public typealias Fdinotificationtype = Int

public fun interface PfnallocFn {
    public operator fun invoke(cb: UInt): MutPtr<CVoid>
}

public typealias Pfnalloc = PfnallocFn?

public fun interface PfncloseFn {
    public operator fun invoke(hf: Long): Int
}

public typealias Pfnclose = PfncloseFn?

public fun interface PfnfciallocFn {
    public operator fun invoke(cb: UInt): MutPtr<CVoid>
}

public typealias Pfnfcialloc = PfnfciallocFn?

public fun interface PfnfcicloseFn {
    public operator fun invoke(hf: Long, err: MutPtr<Int>, pv: MutPtr<CVoid>): Int
}

public typealias Pfnfciclose = PfnfcicloseFn?

public fun interface PfnfcideleteFn {
    public operator fun invoke(pszfile: Pcstr, err: MutPtr<Int>, pv: MutPtr<CVoid>): Int
}

public typealias Pfnfcidelete = PfnfcideleteFn?

public fun interface PfnfcifileplacedFn {
    public operator fun invoke(pccab: MutPtr<Ccab>, pszfile: Pcstr, cbfile: Int, fcontinuation: Bool, pv: MutPtr<CVoid>): Int
}

public typealias Pfnfcifileplaced = PfnfcifileplacedFn?

public fun interface PfnfcifreeFn {
    public operator fun invoke(memory: MutPtr<CVoid>)
}

public typealias Pfnfcifree = PfnfcifreeFn?

public fun interface PfnfcigetnextcabinetFn {
    public operator fun invoke(pccab: MutPtr<Ccab>, cbprevcab: UInt, pv: MutPtr<CVoid>): Bool
}

public typealias Pfnfcigetnextcabinet = PfnfcigetnextcabinetFn?

public fun interface PfnfcigetopeninfoFn {
    public operator fun invoke(pszname: Pcstr, pdate: MutPtr<UShort>, ptime: MutPtr<UShort>, pattribs: MutPtr<UShort>, err: MutPtr<Int>, pv: MutPtr<CVoid>): Long
}

public typealias Pfnfcigetopeninfo = PfnfcigetopeninfoFn?

public fun interface PfnfcigettempfileFn {
    public operator fun invoke(psztempname: Pstr, cbtempname: Int, pv: MutPtr<CVoid>): Bool
}

public typealias Pfnfcigettempfile = PfnfcigettempfileFn?

public fun interface PfnfciopenFn {
    public operator fun invoke(pszfile: Pcstr, oflag: Int, pmode: Int, err: MutPtr<Int>, pv: MutPtr<CVoid>): Long
}

public typealias Pfnfciopen = PfnfciopenFn?

public fun interface PfnfcireadFn {
    public operator fun invoke(hf: Long, memory: MutPtr<CVoid>, cb: UInt, err: MutPtr<Int>, pv: MutPtr<CVoid>): UInt
}

public typealias Pfnfciread = PfnfcireadFn?

public fun interface PfnfciseekFn {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int, err: MutPtr<Int>, pv: MutPtr<CVoid>): Int
}

public typealias Pfnfciseek = PfnfciseekFn?

public fun interface PfnfcistatusFn {
    public operator fun invoke(typestatus: UInt, cb1: UInt, cb2: UInt, pv: MutPtr<CVoid>): Int
}

public typealias Pfnfcistatus = PfnfcistatusFn?

public fun interface PfnfciwriteFn {
    public operator fun invoke(hf: Long, memory: MutPtr<CVoid>, cb: UInt, err: MutPtr<Int>, pv: MutPtr<CVoid>): UInt
}

public typealias Pfnfciwrite = PfnfciwriteFn?

public fun interface PfnfdidecryptFn {
    public operator fun invoke(pfdid: MutPtr<Fdidecrypt>): Int
}

public typealias Pfnfdidecrypt = PfnfdidecryptFn?

public fun interface PfnfdinotifyFn {
    public operator fun invoke(fdint: Fdinotificationtype, pfdin: MutPtr<Fdinotification>): Long
}

public typealias Pfnfdinotify = PfnfdinotifyFn?

public fun interface PfnfreeFn {
    public operator fun invoke(pv: ConstPtr<CVoid>)
}

public typealias Pfnfree = PfnfreeFn?

public fun interface PfnopenFn {
    public operator fun invoke(pszfile: Pcstr, oflag: Int, pmode: Int): Long
}

public typealias Pfnopen = PfnopenFn?

public fun interface PfnreadFn {
    public operator fun invoke(hf: Long, pv: MutPtr<CVoid>, cb: UInt): UInt
}

public typealias Pfnread = PfnreadFn?

public fun interface PfnseekFn {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int): Int
}

public typealias Pfnseek = PfnseekFn?

public fun interface PfnwriteFn {
    public operator fun invoke(hf: Long, pv: ConstPtr<CVoid>, cb: UInt): UInt
}

public typealias Pfnwrite = PfnwriteFn?
