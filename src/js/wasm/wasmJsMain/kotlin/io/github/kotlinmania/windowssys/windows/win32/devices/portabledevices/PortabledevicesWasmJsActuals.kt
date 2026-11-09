@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun DMProcessConfigXMLFiltered(pszxmlin: PCWSTR, rgszallowedcspnodes: Long, dwnumallowedcspnodes: UInt, pbstrxmlout: Long): HRESULT =
    0
