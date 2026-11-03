package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun DMProcessConfigXMLFiltered(pszxmlin: PCWSTR, rgszallowedcspnodes: Long, dwnumallowedcspnodes: UInt, pbstrxmlout: Long): HRESULT {
    return Win32DynamicFfi.invoke("dmprocessxmlfiltered.dll", "DMProcessConfigXMLFiltered", longArrayOf(pszxmlin, rgszallowedcspnodes, dwnumallowedcspnodes.toLong(), pbstrxmlout)).toInt()
}
