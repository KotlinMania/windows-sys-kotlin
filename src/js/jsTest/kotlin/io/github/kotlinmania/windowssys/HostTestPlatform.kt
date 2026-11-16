package io.github.kotlinmania.windowssys

internal actual fun testSupportsHostFfi(): Boolean =
    js("typeof globalThis.process !== 'undefined' && typeof globalThis.process.getBuiltinModule === 'function'") as Boolean
