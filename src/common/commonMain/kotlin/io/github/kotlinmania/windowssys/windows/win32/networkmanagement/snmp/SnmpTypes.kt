package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL

public fun interface PFNSNMPCLEANUPEXFn {
    public operator fun invoke(): UInt
}

public typealias PFNSNMPCLEANUPEX = PFNSNMPCLEANUPEXFn?

public fun interface PFNSNMPEXTENSIONCLOSEFn {
    public operator fun invoke()
}

public typealias PFNSNMPEXTENSIONCLOSE = PFNSNMPEXTENSIONCLOSEFn?

public fun interface PFNSNMPEXTENSIONINITFn {
    public operator fun invoke(dwuptimereference: UInt, phsubagenttrapevent: Long, pfirstsupportedregion: Long): BOOL
}

public typealias PFNSNMPEXTENSIONINIT = PFNSNMPEXTENSIONINITFn?

public fun interface PFNSNMPEXTENSIONINITEXFn {
    public operator fun invoke(pnextsupportedregion: Long): BOOL
}

public typealias PFNSNMPEXTENSIONINITEX = PFNSNMPEXTENSIONINITEXFn?

public fun interface PFNSNMPEXTENSIONMONITORFn {
    public operator fun invoke(pagentmgmtdata: Long): BOOL
}

public typealias PFNSNMPEXTENSIONMONITOR = PFNSNMPEXTENSIONMONITORFn?

public fun interface PFNSNMPEXTENSIONQUERYFn {
    public operator fun invoke(bpdutype: UByte, pvarbindlist: Long, perrorstatus: Long, perrorindex: Long): BOOL
}

public typealias PFNSNMPEXTENSIONQUERY = PFNSNMPEXTENSIONQUERYFn?

public fun interface PFNSNMPEXTENSIONQUERYEXFn {
    public operator fun invoke(nrequesttype: UInt, ntransactionid: UInt, pvarbindlist: Long, pcontextinfo: Long, perrorstatus: Long, perrorindex: Long): BOOL
}

public typealias PFNSNMPEXTENSIONQUERYEX = PFNSNMPEXTENSIONQUERYEXFn?

public fun interface PFNSNMPEXTENSIONTRAPFn {
    public operator fun invoke(penterpriseoid: Long, pgenerictrapid: Long, pspecifictrapid: Long, ptimestamp: Long, pvarbindlist: Long): BOOL
}

public typealias PFNSNMPEXTENSIONTRAP = PFNSNMPEXTENSIONTRAPFn?

public fun interface PFNSNMPSTARTUPEXFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): UInt
}

public typealias PFNSNMPSTARTUPEX = PFNSNMPSTARTUPEXFn?

public fun interface SNMPAPI_CALLBACKFn {
    public operator fun invoke(hsession: Long, hwnd: Foundation.HWND, wmsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, lpclientdata: Long): UInt
}

public typealias SNMPAPI_CALLBACK = SNMPAPI_CALLBACKFn?

public typealias SNMP_API_TRANSLATE_MODE = UInt

public typealias SNMP_ERROR = UInt

public typealias SNMP_ERROR_STATUS = UInt

public typealias SNMP_EXTENSION_REQUEST_TYPE = UInt

public typealias SNMP_GENERICTRAP = UInt

public typealias SNMP_LOG = Int

public typealias SNMP_OUTPUT_LOG_TYPE = UInt

public typealias SNMP_PDU_TYPE = UInt

public typealias SNMP_STATUS = UInt
