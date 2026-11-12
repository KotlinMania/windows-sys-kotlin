package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea

public expect fun pTCloseProvider(hprovider: Hptprovider): Hresult

public expect fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr<Devmodea>, scope: EPrintTicketScope, pprintticket: MutPtr<CVoid>): Hresult

public expect fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr<UInt>, ppdevmode: MutPtr<MutPtr<Devmodea>>, pbstrerrormessage: MutPtr<Bstr>): Hresult

public expect fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pcapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult

public expect fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pdevicecapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult

public expect fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr<CVoid>, pdeviceresources: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult

public expect fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr<CVoid>, pdeltaticket: MutPtr<CVoid>, scope: EPrintTicketScope, presultticket: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult

public expect fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr<Hptprovider>): Hresult

public expect fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr<Hptprovider>, pusedversion: MutPtr<UInt>): Hresult

public expect fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr<UInt>): Hresult

public expect fun pTReleaseMemory(pbuffer: ConstPtr<CVoid>): Hresult
