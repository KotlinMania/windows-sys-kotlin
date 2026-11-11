@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices.cinterop.windowssys_windows_win32_devices_portabledevices_dMProcessConfigXMLFiltered
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: COpaquePointer?, dwnumallowedcspnodes: UInt, pbstrxmlout: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_portabledevices_dMProcessConfigXMLFiltered(pszxmlin?.value?.toCPointer<ByteVar>(), rgszallowedcspnodes?.value?.toCPointer<ByteVar>(), dwnumallowedcspnodes, pbstrxmlout?.value?.toCPointer<ByteVar>())
