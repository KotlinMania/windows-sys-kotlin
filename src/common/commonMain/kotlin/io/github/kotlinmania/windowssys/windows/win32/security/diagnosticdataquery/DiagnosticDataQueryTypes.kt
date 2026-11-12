package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias DdqAccessLevel = Int

public typealias HdiagnosticDataQuerySession = MutPtr<CVoid>

public typealias HdiagnosticEventCategoryDescription = MutPtr<CVoid>

public typealias HdiagnosticEventProducerDescription = MutPtr<CVoid>

public typealias HdiagnosticEventTagDescription = MutPtr<CVoid>

public typealias HdiagnosticRecord = MutPtr<CVoid>

public typealias HdiagnosticReport = MutPtr<CVoid>
