package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun dMProcessConfigXMLFiltered(pszxmlin: Pcwstr, rgszallowedcspnodes: ConstPtr, dwnumallowedcspnodes: UInt, pbstrxmlout: MutPtr): Hresult
