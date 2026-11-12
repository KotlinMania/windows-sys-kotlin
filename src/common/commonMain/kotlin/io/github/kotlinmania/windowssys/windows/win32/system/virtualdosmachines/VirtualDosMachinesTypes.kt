package io.github.kotlinmania.windowssys.windows.win32.system.virtualdosmachines

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.DebugEvent

public fun interface DebugeventprocFn {
    public operator fun invoke(param0: MutPtr<DebugEvent>, param1: MutPtr<CVoid>): UInt
}

public typealias Debugeventproc = DebugeventprocFn?

public fun interface ProcessenumprocFn {
    public operator fun invoke(dwprocessid: UInt, dwattributes: UInt, lpuserdefined: Lparam): Bool
}

public typealias Processenumproc = ProcessenumprocFn?

public fun interface TaskenumprocFn {
    public operator fun invoke(dwthreadid: UInt, hmod16: UShort, htask16: UShort, lpuserdefined: Lparam): Bool
}

public typealias Taskenumproc = TaskenumprocFn?

public fun interface TaskenumprocexFn {
    public operator fun invoke(dwthreadid: UInt, hmod16: UShort, htask16: UShort, pszmodname: MutPtr<Byte>, pszfilename: MutPtr<Byte>, lpuserdefined: Lparam): Bool
}

public typealias Taskenumprocex = TaskenumprocexFn?

public fun interface VdmbreakthreadprocFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Vdmbreakthreadproc = VdmbreakthreadprocFn?

public fun interface VdmdetectwowprocFn {
    public operator fun invoke(): Bool
}

public typealias Vdmdetectwowproc = VdmdetectwowprocFn?

public fun interface VdmenumprocesswowprocFn {
    public operator fun invoke(param0: Processenumproc, param1: Lparam): Int
}

public typealias Vdmenumprocesswowproc = VdmenumprocesswowprocFn?

public fun interface VdmenumtaskwowexprocFn {
    public operator fun invoke(param0: UInt, param1: Taskenumprocex, param2: Lparam): Int
}

public typealias Vdmenumtaskwowexproc = VdmenumtaskwowexprocFn?

public fun interface VdmenumtaskwowprocFn {
    public operator fun invoke(param0: UInt, param1: Taskenumproc, param2: Lparam): Int
}

public typealias Vdmenumtaskwowproc = VdmenumtaskwowprocFn?

public fun interface VdmgetaddrexpressionprocFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: MutPtr<UShort>, param3: MutPtr<UInt>, param4: MutPtr<UShort>): Bool
}

public typealias Vdmgetaddrexpressionproc = VdmgetaddrexpressionprocFn?

public fun interface VdmgetcontextprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Vdmcontext>): Bool
}

public typealias Vdmgetcontextproc = VdmgetcontextprocFn?

public fun interface VdmgetdbgflagsprocFn {
    public operator fun invoke(param0: Handle): UInt
}

public typealias Vdmgetdbgflagsproc = VdmgetdbgflagsprocFn?

public fun interface VdmgetmoduleselectorprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: UInt, param3: Pcstr, param4: MutPtr<UShort>): Bool
}

public typealias Vdmgetmoduleselectorproc = VdmgetmoduleselectorprocFn?

public fun interface VdmgetpointerprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: UShort, param3: UInt, param4: Bool): UInt
}

public typealias Vdmgetpointerproc = VdmgetpointerprocFn?

public fun interface VdmgetsegmentinfoprocFn {
    public operator fun invoke(param0: UShort, param1: UInt, param2: Bool, param3: VdmSeginfo): Bool
}

public typealias Vdmgetsegmentinfoproc = VdmgetsegmentinfoprocFn?

public fun interface VdmgetselectormoduleprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: UShort, param3: MutPtr<UInt>, param4: Pcstr, param5: UInt, param6: Pcstr, param7: UInt): Bool
}

public typealias Vdmgetselectormoduleproc = VdmgetselectormoduleprocFn?

public fun interface VdmgetsymbolprocFn {
    public operator fun invoke(param0: Pcstr, param1: UShort, param2: UInt, param3: Bool, param4: Bool, param5: Pstr, param6: MutPtr<UInt>): Bool
}

public typealias Vdmgetsymbolproc = VdmgetsymbolprocFn?

public fun interface VdmgetthreadselectorentryprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: UInt, param3: MutPtr<VdmldtEntry>): Bool
}

public typealias Vdmgetthreadselectorentryproc = VdmgetthreadselectorentryprocFn?

public fun interface VdmglobalfirstprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Globalentry>, param3: UShort, param4: Debugeventproc, param5: MutPtr<CVoid>): Bool
}

public typealias Vdmglobalfirstproc = VdmglobalfirstprocFn?

public fun interface VdmglobalnextprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Globalentry>, param3: UShort, param4: Debugeventproc, param5: MutPtr<CVoid>): Bool
}

public typealias Vdmglobalnextproc = VdmglobalnextprocFn?

public fun interface VdmismoduleloadedprocFn {
    public operator fun invoke(param0: Pcstr): Bool
}

public typealias Vdmismoduleloadedproc = VdmismoduleloadedprocFn?

public fun interface VdmkillwowprocFn {
    public operator fun invoke(): Bool
}

public typealias Vdmkillwowproc = VdmkillwowprocFn?

public fun interface VdmmodulefirstprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Moduleentry>, param3: Debugeventproc, param4: MutPtr<CVoid>): Bool
}

public typealias Vdmmodulefirstproc = VdmmodulefirstprocFn?

public fun interface VdmmodulenextprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Moduleentry>, param3: Debugeventproc, param4: MutPtr<CVoid>): Bool
}

public typealias Vdmmodulenextproc = VdmmodulenextprocFn?

public fun interface VdmprocessexceptionprocFn {
    public operator fun invoke(param0: MutPtr<DebugEvent>): Bool
}

public typealias Vdmprocessexceptionproc = VdmprocessexceptionprocFn?

public fun interface VdmsetcontextprocFn {
    public operator fun invoke(param0: Handle, param1: Handle, param2: MutPtr<Vdmcontext>): Bool
}

public typealias Vdmsetcontextproc = VdmsetcontextprocFn?

public fun interface VdmsetdbgflagsprocFn {
    public operator fun invoke(param0: Handle, param1: UInt): Bool
}

public typealias Vdmsetdbgflagsproc = VdmsetdbgflagsprocFn?

public fun interface VdmstarttaskinwowprocFn {
    public operator fun invoke(param0: UInt, param1: Pcstr, param2: UShort): Bool
}

public typealias Vdmstarttaskinwowproc = VdmstarttaskinwowprocFn?

public fun interface VdmterminatetaskinwowprocFn {
    public operator fun invoke(param0: UInt, param1: UShort): Bool
}

public typealias Vdmterminatetaskinwowproc = VdmterminatetaskinwowprocFn?
