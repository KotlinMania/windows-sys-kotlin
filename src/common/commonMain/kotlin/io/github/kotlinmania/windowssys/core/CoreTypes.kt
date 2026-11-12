package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Bool = Int

public typealias Hresult = Int

public typealias Pstr = MutPtr<UByte>

public typealias Pwstr = MutPtr<UShort>

public typealias Pcstr = ConstPtr<UByte>

public typealias Pcwstr = ConstPtr<UShort>

public typealias Bstr = ConstPtr<UShort>

public typealias Hstring = MutPtr<CVoid>
