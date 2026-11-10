package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun pTCloseProvider(hprovider: Hptprovider): Hresult

public expect fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult

public expect fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult

public expect fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult

public expect fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult

public expect fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult

public expect fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult

public expect fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult

public expect fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult

public expect fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult

public expect fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult
