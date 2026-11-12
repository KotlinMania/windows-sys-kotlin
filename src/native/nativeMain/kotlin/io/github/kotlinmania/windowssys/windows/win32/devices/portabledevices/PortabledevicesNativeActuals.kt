@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices.cinterop.windowssysWindowsWin32DevicesPortabledevicesDMProcessConfigXMLFiltered
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: ConstPtr, dwnumallowedcspnodes: UInt, pbstrxmlout: MutPtr): Hresult =
    windowssysWindowsWin32DevicesPortabledevicesDMProcessConfigXMLFiltered(pszxmlin.rawAddress.toCPointer<ByteVar>(), rgszallowedcspnodes.rawAddress.toCPointer<ByteVar>(), dwnumallowedcspnodes, pbstrxmlout.rawAddress.toCPointer<ByteVar>())
