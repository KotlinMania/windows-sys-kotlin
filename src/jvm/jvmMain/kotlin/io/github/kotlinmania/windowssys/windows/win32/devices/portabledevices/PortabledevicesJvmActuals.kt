@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32DevicesPortabledevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_portabledevices_DMProcessConfigXMLFiltered(pszxmlin: Long, rgszallowedcspnodes: Long, dwnumallowedcspnodes: Int, pbstrxmlout: Long): Int
}

public actual fun DMProcessConfigXMLFiltered(pszxmlin: PCWSTR, rgszallowedcspnodes: Long, dwnumallowedcspnodes: UInt, pbstrxmlout: Long): HRESULT =
    WindowsWin32DevicesPortabledevicesJniBridge.windowssys_windows_win32_devices_portabledevices_DMProcessConfigXMLFiltered(pszxmlin, rgszallowedcspnodes, dwnumallowedcspnodes.toInt(), pbstrxmlout)
