@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesPortabledevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_portabledevices_dMProcessConfigXMLFiltered(pszxmlin: Long, rgszallowedcspnodes: Long, dwnumallowedcspnodes: Int, pbstrxmlout: Long): Int
}

public actual fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: COpaquePointer?, dwnumallowedcspnodes: UInt, pbstrxmlout: COpaquePointer?): Hresult =
    WindowsWin32DevicesPortabledevicesJniBridge.windowssys_windows_win32_devices_portabledevices_dMProcessConfigXMLFiltered((pszxmlin?.value ?: 0L), (rgszallowedcspnodes?.value ?: 0L), dwnumallowedcspnodes.toInt(), (pbstrxmlout?.value ?: 0L))
