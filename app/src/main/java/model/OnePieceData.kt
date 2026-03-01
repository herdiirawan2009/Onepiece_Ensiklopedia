package com.example.onepieceensiklopedia.model

import com.example.onepieceensiklopedia.R

object OnePieceData {
    val listData: ArrayList<OnePiece>
        get() {
            val list = arrayListOf<OnePiece>()

            list.add(
                OnePiece(
                    "Grand Line",
                    "Jalur laut paling berbahaya di dunia yang membagi dunia menjadi dua bagian besar.",
                    R.drawable.one_piece_map
                )
            )

            list.add(
                OnePiece(
                    "Devil Fruit",
                    "Buah misterius yang memberikan kekuatan supranatural kepada pemakannya.",
                    R.drawable.one_piece_devil_fruits
                )
            )

            list.add(
                OnePiece(
                    "Bounty System",
                    "Sistem harga buronan yang dikeluarkan oleh Pemerintah Dunia untuk bajak laut.",
                    R.drawable.one_piece_bounty
                )
            )

            list.add(
                OnePiece(
                    "Gol D. Roger",
                    "Sang Raja Bajak Laut yang memicu era bajak laut besar melalui kata-kata terakhirnya.",
                    R.drawable.roger
                )
            )

            list.add(
                OnePiece(
                    "Bajak Laut",
                    "Para petualang laut yang mencari kebebasan dan harta karun legendaris One Piece.",
                    R.drawable.bajak_laut_one_piece
                )
            )

            return list
        }
}