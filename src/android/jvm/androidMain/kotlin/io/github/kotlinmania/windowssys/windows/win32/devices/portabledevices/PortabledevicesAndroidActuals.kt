@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesPortabledevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesPortabledevicesDMProcessConfigXMLFiltered(pszxmlin: Long, rgszallowedcspnodes: Long, dwnumallowedcspnodes: Int, pbstrxmlout: Long): Int
}

public actual fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: ConstPtr<Pcwstr>, dwnumallowedcspnodes: UInt, pbstrxmlout: MutPtr<Bstr>): Hresult =
    WindowsWin32DevicesPortabledevicesJniBridge.windowssysWindowsWin32DevicesPortabledevicesDMProcessConfigXMLFiltered(pszxmlin.rawAddress, rgszallowedcspnodes.rawAddress, dwnumallowedcspnodes.toInt(), pbstrxmlout.rawAddress)
