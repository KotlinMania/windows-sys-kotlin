@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys

@JsFun("() => typeof globalThis.process !== 'undefined' && typeof globalThis.process.getBuiltinModule === 'function'")
private external fun isNodeFfiHost(): Boolean

internal actual fun testSupportsHostFfi(): Boolean = isNodeFfiHost()
