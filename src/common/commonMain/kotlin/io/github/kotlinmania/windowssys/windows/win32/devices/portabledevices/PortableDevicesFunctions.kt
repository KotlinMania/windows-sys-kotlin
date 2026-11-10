package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: COpaquePointer?, dwnumallowedcspnodes: UInt, pbstrxmlout: COpaquePointer?): Hresult
