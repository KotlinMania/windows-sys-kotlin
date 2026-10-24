# Factory increment: Rust remains the authority

The unchanged generated [fixture](fixture/candidate.kt) compiles with the separate
test provider in `TestIntegration.kt`. The original Rust and Kotlin both report
`first|42`, `second|43`, `calls|2`. The generator retains the two factory names,
their source order, nested value scopes and all seven comments. Repeated output is
byte-identical. The 168-test translator report is saved in `tests/`; no prior
regression failed. This does not establish trait dispatch or Windows ABI behavior.

The complete original WebSocket module is retained at [websocket/input.rs](websocket/input.rs).
All five explicit default factory blocks now have Kotlin syntax in
[websocket/candidate.kt](websocket/candidate.kt), preserving
`return run { core.mem.zeroed() }` (quoted Kotlin names in the actual output).
The call is unresolved. No zero-value implementation, shared union storage, pointer
allocation or native ABI is supplied. Other unsupported declarations remain visible.

## Ordinary diff against the existing port

[console-plain.diff](console-plain.diff) is an ordinary `diff -u` between the saved
existing [ConsoleStructs.kt](ConsoleStructs.kt) and the complete pass-06 Console
candidate. The Kotlin port is split across several files, so the additional foreign
functions/constants in this full-source diff are not automatically missing-port bugs.

Rust `Windows/Win32/System/Console/mod.rs:110–114` explicitly defines
`CHAR_INFO::default()` by calling `core::mem::zeroed()`. The existing Kotlin port
instead places default values on constructor fields (`ConsoleStructs.kt:26–29`).
The generator now retains the explicit associated factory call and its source
position; it does not copy the port's constructor defaults or claim them equivalent.
The source also defines `CHAR_INFO_0` as a union at lines 117–120. That union is
still unsupported here. Kotlin field declarations/defaults alone do not establish
overlapping native storage, so this diff is not a reason to adopt either class
representation as a verified ABI implementation.

The Console candidate now contains 12 factory methods, 96 mapped declarations,
130 syntax candidates and three unsupported unions. The three unions remain as
original commented Rust with explicit diagnostics. No production file was edited.

`validation.json` and `console-comparison.json` record executable/source/output
hashes and the exact scope of the checks. Full inventory results belong to pass 06;
these focused observations are not a whole-library equivalence claim.
