package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Bool = Int

public typealias Hresult = Int

public typealias Pstr = MutPtr

public typealias Pwstr = MutPtr

public typealias Pcstr = ConstPtr

public typealias Pcwstr = ConstPtr

public typealias Bstr = ConstPtr

public typealias Hstring = MutPtr
