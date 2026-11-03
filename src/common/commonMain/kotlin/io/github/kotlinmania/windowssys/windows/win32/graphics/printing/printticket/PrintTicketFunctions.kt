package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun PTCloseProvider(hprovider: HPTPROVIDER): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTCloseProvider", longArrayOf(hprovider)).toInt()
}

public fun PTConvertDevModeToPrintTicket(hprovider: HPTPROVIDER, cbdevmode: UInt, pdevmode: Long, scope: EPrintTicketScope, pprintticket: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTConvertDevModeToPrintTicket", longArrayOf(hprovider, cbdevmode.toLong(), pdevmode, scope.toLong(), pprintticket)).toInt()
}

public fun PTConvertPrintTicketToDevMode(hprovider: HPTPROVIDER, pprintticket: Long, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTConvertPrintTicketToDevMode", longArrayOf(hprovider, pprintticket, basedevmodetype.toLong(), scope.toLong(), pcbdevmode, ppdevmode, pbstrerrormessage)).toInt()
}

public fun PTGetPrintCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTGetPrintCapabilities", longArrayOf(hprovider, pprintticket, pcapabilities, pbstrerrormessage)).toInt()
}

public fun PTGetPrintDeviceCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTGetPrintDeviceCapabilities", longArrayOf(hprovider, pprintticket, pdevicecapabilities, pbstrerrormessage)).toInt()
}

public fun PTGetPrintDeviceResources(hprovider: HPTPROVIDER, pszlocalename: PCWSTR, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTGetPrintDeviceResources", longArrayOf(hprovider, pszlocalename, pprintticket, pdeviceresources, pbstrerrormessage)).toInt()
}

public fun PTMergeAndValidatePrintTicket(hprovider: HPTPROVIDER, pbaseticket: Long, pdeltaticket: Long, scope: EPrintTicketScope, presultticket: Long, pbstrerrormessage: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTMergeAndValidatePrintTicket", longArrayOf(hprovider, pbaseticket, pdeltaticket, scope.toLong(), presultticket, pbstrerrormessage)).toInt()
}

public fun PTOpenProvider(pszprintername: PCWSTR, dwversion: UInt, phprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTOpenProvider", longArrayOf(pszprintername, dwversion.toLong(), phprovider)).toInt()
}

public fun PTOpenProviderEx(pszprintername: PCWSTR, dwmaxversion: UInt, dwprefversion: UInt, phprovider: Long, pusedversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTOpenProviderEx", longArrayOf(pszprintername, dwmaxversion.toLong(), dwprefversion.toLong(), phprovider, pusedversion)).toInt()
}

public fun PTQuerySchemaVersionSupport(pszprintername: PCWSTR, pmaxversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTQuerySchemaVersionSupport", longArrayOf(pszprintername, pmaxversion)).toInt()
}

public fun PTReleaseMemory(pbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("prntvpt.dll", "PTReleaseMemory", longArrayOf(pbuffer)).toInt()
}
