package io.github.kotlinmania.windowssys.windows.win32.system.virtualdosmachines

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM

public fun interface DEBUGEVENTPROCFn {
    public operator fun invoke(param0: Long, param1: Long): UInt
}

public typealias DEBUGEVENTPROC = DEBUGEVENTPROCFn?

public fun interface PROCESSENUMPROCFn {
    public operator fun invoke(dwprocessid: UInt, dwattributes: UInt, lpuserdefined: LPARAM): BOOL
}

public typealias PROCESSENUMPROC = PROCESSENUMPROCFn?

public fun interface TASKENUMPROCFn {
    public operator fun invoke(dwthreadid: UInt, hmod16: UShort, htask16: UShort, lpuserdefined: LPARAM): BOOL
}

public typealias TASKENUMPROC = TASKENUMPROCFn?

public fun interface TASKENUMPROCEXFn {
    public operator fun invoke(dwthreadid: UInt, hmod16: UShort, htask16: UShort, pszmodname: Long, pszfilename: Long, lpuserdefined: LPARAM): BOOL
}

public typealias TASKENUMPROCEX = TASKENUMPROCEXFn?

public fun interface VDMBREAKTHREADPROCFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias VDMBREAKTHREADPROC = VDMBREAKTHREADPROCFn?

public fun interface VDMDETECTWOWPROCFn {
    public operator fun invoke(): BOOL
}

public typealias VDMDETECTWOWPROC = VDMDETECTWOWPROCFn?

public fun interface VDMENUMPROCESSWOWPROCFn {
    public operator fun invoke(param0: PROCESSENUMPROC, param1: LPARAM): Int
}

public typealias VDMENUMPROCESSWOWPROC = VDMENUMPROCESSWOWPROCFn?

public fun interface VDMENUMTASKWOWEXPROCFn {
    public operator fun invoke(param0: UInt, param1: TASKENUMPROCEX, param2: LPARAM): Int
}

public typealias VDMENUMTASKWOWEXPROC = VDMENUMTASKWOWEXPROCFn?

public fun interface VDMENUMTASKWOWPROCFn {
    public operator fun invoke(param0: UInt, param1: TASKENUMPROC, param2: LPARAM): Int
}

public typealias VDMENUMTASKWOWPROC = VDMENUMTASKWOWPROCFn?

public fun interface VDMGETADDREXPRESSIONPROCFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): BOOL
}

public typealias VDMGETADDREXPRESSIONPROC = VDMGETADDREXPRESSIONPROCFn?

public fun interface VDMGETCONTEXTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long): BOOL
}

public typealias VDMGETCONTEXTPROC = VDMGETCONTEXTPROCFn?

public fun interface VDMGETDBGFLAGSPROCFn {
    public operator fun invoke(param0: HANDLE): UInt
}

public typealias VDMGETDBGFLAGSPROC = VDMGETDBGFLAGSPROCFn?

public fun interface VDMGETMODULESELECTORPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: UInt, param3: PCSTR, param4: Long): BOOL
}

public typealias VDMGETMODULESELECTORPROC = VDMGETMODULESELECTORPROCFn?

public fun interface VDMGETPOINTERPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: UShort, param3: UInt, param4: BOOL): UInt
}

public typealias VDMGETPOINTERPROC = VDMGETPOINTERPROCFn?

public fun interface VDMGETSEGMENTINFOPROCFn {
    public operator fun invoke(param0: UShort, param1: UInt, param2: BOOL, param3: VDM_SEGINFO): BOOL
}

public typealias VDMGETSEGMENTINFOPROC = VDMGETSEGMENTINFOPROCFn?

public fun interface VDMGETSELECTORMODULEPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: UShort, param3: Long, param4: PCSTR, param5: UInt, param6: PCSTR, param7: UInt): BOOL
}

public typealias VDMGETSELECTORMODULEPROC = VDMGETSELECTORMODULEPROCFn?

public fun interface VDMGETSYMBOLPROCFn {
    public operator fun invoke(param0: PCSTR, param1: UShort, param2: UInt, param3: BOOL, param4: BOOL, param5: PSTR, param6: Long): BOOL
}

public typealias VDMGETSYMBOLPROC = VDMGETSYMBOLPROCFn?

public fun interface VDMGETTHREADSELECTORENTRYPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: UInt, param3: Long): BOOL
}

public typealias VDMGETTHREADSELECTORENTRYPROC = VDMGETTHREADSELECTORENTRYPROCFn?

public fun interface VDMGLOBALFIRSTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long, param3: UShort, param4: DEBUGEVENTPROC, param5: Long): BOOL
}

public typealias VDMGLOBALFIRSTPROC = VDMGLOBALFIRSTPROCFn?

public fun interface VDMGLOBALNEXTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long, param3: UShort, param4: DEBUGEVENTPROC, param5: Long): BOOL
}

public typealias VDMGLOBALNEXTPROC = VDMGLOBALNEXTPROCFn?

public fun interface VDMISMODULELOADEDPROCFn {
    public operator fun invoke(param0: PCSTR): BOOL
}

public typealias VDMISMODULELOADEDPROC = VDMISMODULELOADEDPROCFn?

public fun interface VDMKILLWOWPROCFn {
    public operator fun invoke(): BOOL
}

public typealias VDMKILLWOWPROC = VDMKILLWOWPROCFn?

public fun interface VDMMODULEFIRSTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long, param3: DEBUGEVENTPROC, param4: Long): BOOL
}

public typealias VDMMODULEFIRSTPROC = VDMMODULEFIRSTPROCFn?

public fun interface VDMMODULENEXTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long, param3: DEBUGEVENTPROC, param4: Long): BOOL
}

public typealias VDMMODULENEXTPROC = VDMMODULENEXTPROCFn?

public fun interface VDMPROCESSEXCEPTIONPROCFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias VDMPROCESSEXCEPTIONPROC = VDMPROCESSEXCEPTIONPROCFn?

public fun interface VDMSETCONTEXTPROCFn {
    public operator fun invoke(param0: HANDLE, param1: HANDLE, param2: Long): BOOL
}

public typealias VDMSETCONTEXTPROC = VDMSETCONTEXTPROCFn?

public fun interface VDMSETDBGFLAGSPROCFn {
    public operator fun invoke(param0: HANDLE, param1: UInt): BOOL
}

public typealias VDMSETDBGFLAGSPROC = VDMSETDBGFLAGSPROCFn?

public fun interface VDMSTARTTASKINWOWPROCFn {
    public operator fun invoke(param0: UInt, param1: PCSTR, param2: UShort): BOOL
}

public typealias VDMSTARTTASKINWOWPROC = VDMSTARTTASKINWOWPROCFn?

public fun interface VDMTERMINATETASKINWOWPROCFn {
    public operator fun invoke(param0: UInt, param1: UShort): BOOL
}

public typealias VDMTERMINATETASKINWOWPROC = VDMTERMINATETASKINWOWPROCFn?
