package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun PTCloseProvider(hprovider: HPTPROVIDER): HRESULT

public expect fun PTConvertDevModeToPrintTicket(hprovider: HPTPROVIDER, cbdevmode: UInt, pdevmode: Long, scope: EPrintTicketScope, pprintticket: Long): HRESULT

public expect fun PTConvertPrintTicketToDevMode(hprovider: HPTPROVIDER, pprintticket: Long, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): HRESULT

public expect fun PTGetPrintCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): HRESULT

public expect fun PTGetPrintDeviceCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): HRESULT

public expect fun PTGetPrintDeviceResources(hprovider: HPTPROVIDER, pszlocalename: PCWSTR, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): HRESULT

public expect fun PTMergeAndValidatePrintTicket(hprovider: HPTPROVIDER, pbaseticket: Long, pdeltaticket: Long, scope: EPrintTicketScope, presultticket: Long, pbstrerrormessage: Long): HRESULT

public expect fun PTOpenProvider(pszprintername: PCWSTR, dwversion: UInt, phprovider: Long): HRESULT

public expect fun PTOpenProviderEx(pszprintername: PCWSTR, dwmaxversion: UInt, dwprefversion: UInt, phprovider: Long, pusedversion: Long): HRESULT

public expect fun PTQuerySchemaVersionSupport(pszprintername: PCWSTR, pmaxversion: Long): HRESULT

public expect fun PTReleaseMemory(pbuffer: Long): HRESULT
