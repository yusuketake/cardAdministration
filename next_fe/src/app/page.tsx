import Image from 'next/image'
import { Input } from 'postcss'
import React from 'react'
import { ReactDOM } from 'react'

import Data from './accounts.json';
import accounts from "./accounts.json"

export default function Home() {
  return (
    <>
      <div>
        <input type="text" className="input-search" />
        <input type="button" value="search" className="button-search" />
      </div>
      {
          accounts.forEach((element)=> console.log(element))
        }

      <div className="table-area">
        <table>
          <tr>
            <th>名前</th>
            <th>年齢</th>
            <th>アカウントid</th>
          </tr>
          {accounts.map(({name,age,id},index)=>(
            <tr>
              <td>{name}</td>
              <td>{age}</td>
              <td>{id}</td>
            </tr>
          ))}
        </table>
      </div>
    </>
  )
}
