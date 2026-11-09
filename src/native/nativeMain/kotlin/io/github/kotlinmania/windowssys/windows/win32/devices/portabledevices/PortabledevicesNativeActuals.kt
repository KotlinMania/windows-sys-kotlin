@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DMProcessConfigXMLFiltered(pszxmlin: PCWSTR, rgszallowedcspnodes: Long, dwnumallowedcspnodes: UInt, pbstrxmlout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices.cinterop.windowssys_windows_win32_devices_portabledevices_DMProcessConfigXMLFiltered(pszxmlin.toCPointer<ByteVar>(), rgszallowedcspnodes.toCPointer<ByteVar>(), dwnumallowedcspnodes, pbstrxmlout.toCPointer<ByteVar>())
